package es.upm.grise.prof.curso2023.control1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPedido {	
	private static final String NOMBRE = "Auriculares";
	private static final double PRECIO = 40;
	private static final int UNIDADES = 2;
	
	@Test
	public void testImportePedido() {
		Pedido pedido = new Pedido(NOMBRE, UNIDADES, PRECIO);
		double importe = pedido.unidades * pedido.precio;
		assertEquals(importe, pedido.getImportePedido());
	}

}