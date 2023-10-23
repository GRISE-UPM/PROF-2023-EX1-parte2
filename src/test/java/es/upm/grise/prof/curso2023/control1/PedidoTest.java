package es.upm.grise.prof.curso2023.control1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PedidoTest {

	private String testTexto;
	private int testUnidades;
	private double testPrecio;
	private Pedido pedido;

	@BeforeEach
	public void setUp() {
		testTexto = "testTexto";
		testUnidades = 3;
		testPrecio = 20;
		pedido = new Pedido(testTexto, testUnidades, testPrecio);
	}

	@Test
	@DisplayName("Test basico")
	public void testBasico() {
		double numeroEsperado = testUnidades * testPrecio;
		double actualImporte = pedido.getImportePedido();

		assertEquals(numeroEsperado, actualImporte, "El importe deberia encajar.");
	}
}
