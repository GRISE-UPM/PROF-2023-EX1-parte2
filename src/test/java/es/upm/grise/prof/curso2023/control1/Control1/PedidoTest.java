package es.upm.grise.prof.curso2023.control1.Control1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PedidoTest {
	
	@Test
	@DisplayName("Verifica que el importe de un pedido sea correcto")
	public void CaculaImportePedidoTest() {
		// Definimos los datos del pedido
		String producto = "Producto A";
		int unidades = 5;
		double precio = 10.0;
		Pedido pedido = new Pedido(producto, unidades, precio);
		double importeEsperado = unidades * precio;
		double importeCalculado = pedido.getImportePedido();
		assertEquals(importeEsperado, importeCalculado);
	}
}
