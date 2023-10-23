package es.upm.grise.prof.curso2023.control1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPedido {	
	private static final String NOMBRE = "Auriculares";
	private static final double PRECIO = 40;
	private static final int UNIDADES = 2;
	
	private static final String NOMBRE2 = "Teclado";
	private static final double PRECIO2 = 20;
	private static final int UNIDADES2 = 1;

	@Test
	public void testImportePedido() {
		Pedido pedido = new Pedido(NOMBRE, UNIDADES, PRECIO);
		double importe = pedido.unidades * pedido.precio;
		assertEquals(importe, pedido.getImportePedido());
	}

	@Test
	public void testNoHayPedidosException() throws NoHayPedidosException {
		Cliente cliente = new Cliente();
		
		assertThrows(NoHayPedidosException.class, () -> cliente.calculaImportePedidos());
	}
	
	@Test 
	public void testcalculaImportePedidos() throws NoHayPedidosException{
		Cliente cliente = new Cliente();
		Pedido pedido1 = new Pedido(NOMBRE, UNIDADES, PRECIO);
		Pedido pedido2 = new Pedido(NOMBRE2, UNIDADES2, PRECIO2);
		
		cliente.setPedido(pedido1);
		cliente.setPedido(pedido2);
		
		double importe = pedido1.unidades * pedido1.precio +
				pedido2.unidades * pedido2.precio;
		
		assertEquals(importe, cliente.calculaImportePedidos());
	}
}