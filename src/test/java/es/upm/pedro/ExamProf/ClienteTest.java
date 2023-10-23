package es.upm.pedro.ExamProf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClienteTest {

	private Cliente cliente1;
	private Pedido pedido1;
	private Pedido pedido2;
	private Cliente cliente2;

	@BeforeEach
	private void initialization() {
		String item1 = "aceite";
		int unidades1 = 4;
		double precio1 = 5.4;
		String item2 = "pan";
		int unidades2 = 2;
		double precio2 = 0.5;
		pedido1 = new Pedido(item1, unidades1, precio1);
		pedido2 = new Pedido(item2, unidades2, precio2);
		cliente1 = new Cliente();
		cliente1.setPedido(pedido1);
		cliente1.setPedido(pedido2);
		cliente2 = new Cliente();
	}


	@Test
	@DisplayName("Test excepcion cuando no hay pedidos")
	void noPedidosExecptionTest() throws NoHayPedidosException{
		assertThrows(NoHayPedidosException.class, cliente2.calculaImportePedidos(), "No se ha lanzado la excepcion NoHayPedidos al no haber pedidos");
	}

	@Test
	@DisplayName("Test para calcular el pecio del pedido")
	void calcularPrecioPedidosTest() throws NoHayPedidosException {
		double importeTotal = 22.6;
		assertEquals(importeTotal, cliente1.calculaImportePedidos(), "No se calcula correctamente el importe total del Cliente 1");
	}

}
