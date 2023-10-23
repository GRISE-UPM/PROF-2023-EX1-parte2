package es.upm.grise.examen.examen_a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
/**
 * Unit test for simple App.
 */
public class AppTest {
	
	static Pedido pedido;
	static Cliente cliente;
	
	@BeforeEach
	void setup() {
		pedido = new Pedido("caramelo",1,3);
		cliente = new Cliente();
	}
	
	@Test
	@DisplayName("- - - Metodo getImportePedido() de Pedido - - -")
	public void pedidoTest() {
		double importe_esperado = 3;
		double pedido_realizado = pedido.getImportePedido();
		assertEquals(importe_esperado, pedido_realizado);
	}
	
	@Test
	@DisplayName("- - - Metodo calculaImportePedidos() de Cliente este vacio - - -")
	public void calculaImportePedidos() {
		try {
			double pedido_realizado = cliente.calculaImportePedidos();
			fail();
		} catch (NoHayPedidosException e) {
			// TODO Auto-generated catch block
			assertTrue(true);
		}
	}
	
	
	@Test
	@DisplayName("- - - Metodo calculaImportePedidos2() de Cliente con importe correcto - - -")
	public void calculaImportePedidos2() {
		try {
			double importe_esperado = 3;
			cliente.setPedido(pedido);
			double pedido_realizado;
			pedido_realizado = cliente.calculaImportePedidos();
			assertEquals(importe_esperado, pedido_realizado);
		} catch (NoHayPedidosException e) {
			// TODO Auto-generated catch block
			fail();
		}
		
	}
	

}

