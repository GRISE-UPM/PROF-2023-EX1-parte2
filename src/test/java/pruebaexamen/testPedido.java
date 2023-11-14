package pruebaexamen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testPedido {
	
	Pedido pedido = new Pedido("comida",3,1);
	
	@Test
	void test() {
		double cantidad = 3.0;
		assertEquals(cantidad ,pedido.getImportePedido());
	}
	

}
