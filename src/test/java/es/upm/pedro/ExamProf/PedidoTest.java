package es.upm.pedro.ExamProf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PedidoTest {

	private Pedido pedido;

	@BeforeEach
	private void initialization() {
		String item = "aceite";
		int unidades = 4;
		double precio = 5.4;
		pedido = new Pedido(item, unidades, precio);
	}

	@Test
	@DisplayName("Price calculator test")
	void priceCalculatorTest() {
		double importePedido = 21.6;
		assertEquals(importePedido, pedido.getImportePedido(), "Importe pedido incorrecto");
	}

}
