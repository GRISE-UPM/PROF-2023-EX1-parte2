package es.upm.carlosAgramonte.carlosAgramonte2023;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class Test {


	static public void beforeAll() {
		System.out.println("Executed before any test has been run");
	}
	@org.junit.jupiter.api.Test
	void testPedido() {
		Pedido pedido = new Pedido("test",5,2);
		int rest=10;
		assertEquals(rest, pedido.getImportePedido());	}
	@org.junit.jupiter.api.Test
	void testClienteSinPedidos()throws NoHayPedidosException{
		Cliente cliente = new Cliente();
		Assertions.assertThrows(NoHayPedidosException.class,()-> cliente.calculaImportePedidos());	
	}
	@org.junit.jupiter.api.Test
	void testClienteSinImporte() throws NoHayPedidosException {
		Cliente cliente = new Cliente();
		int rest = 4;
		cliente.setPedido(new Pedido("pedido1",2,2));
		assertEquals(rest, cliente.calculaImportePedidos());	}
	
}
