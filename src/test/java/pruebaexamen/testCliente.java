package pruebaexamen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCliente {
	static Cliente cliente = new Cliente();

	@Test
	void testPedidoVacio() throws NoHayPedidosException {
		
		assertThrows(NoHayPedidosException.class, () -> cliente.calculaImportePedidos() );
	}
	
	@Test
	void testPedido() throws NoHayPedidosException {
		Pedido pedido = new Pedido("comida", 2, 1);
		double correcto =2;
		cliente.setPedido(pedido);
		
		assertEquals(correcto, cliente.calculaImportePedidos());
		
		
	}
	

}
