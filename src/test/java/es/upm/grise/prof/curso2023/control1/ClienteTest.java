package es.upm.grise.prof.curso2023.control1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ClienteTest {

	private Cliente cliente;
	private static final int UNIDADES_PEDIDO_1 = 2;
	private static final double PRECIO_PEDIDO_1 = 10.0;
	private static final int UNIDADES_PEDIDO_2 = 3;
	private static final double PRECIO_PEDIDO_2 = 20.0;

	@BeforeEach
	public void init() {
		cliente = new Cliente();
	}

	@Test
	@DisplayName("Si no hay pedidos el programa debería lanzar NoHayPedidosException")
	public void lanzarExcepcion() {
		assertThrows(NoHayPedidosException.class, () -> {
			cliente.calculaImportePedidos();
		});
	}

	@Test
	@DisplayName("Si hay pedidos deberua dar un valor normal")
	public void retornoCorrecto() throws NoHayPedidosException {
		Pedido pedido1 = new Pedido("item1", UNIDADES_PEDIDO_1, PRECIO_PEDIDO_1);
		Pedido pedido2 = new Pedido("item2", UNIDADES_PEDIDO_2, PRECIO_PEDIDO_2);

		cliente.setPedido(pedido1);
		cliente.setPedido(pedido2);

		double importeEsperado = UNIDADES_PEDIDO_1 * PRECIO_PEDIDO_1 + UNIDADES_PEDIDO_2 * PRECIO_PEDIDO_2;
		double importeActual = cliente.calculaImportePedidos();

		assertEquals(importeEsperado, importeActual, "El importe total debería coincidir con el valor esperado.");
	}
}
