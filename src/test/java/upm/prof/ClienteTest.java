package upm.prof;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ClienteTest {
	
	Cliente cliente;
	
	@BeforeEach
	public void instanciaCliente() {
		cliente = new Cliente();
	}

	@Test
	public void testNoPedidos() throws NoHayPedidosException {
		assertThrows(NoHayPedidosException.class, () -> cliente.calculaImportePedidos(), "No se ha lanzado la excepción con 0 pedidos añadidos");
	}
	
	@Test
	public void testVariosPedidos() throws NoHayPedidosException {
		String nombre1 = "Ajo";
		final double coste1 = 1.1;
		final int uds1 = 4;
		
		String nombre2 = "Azucar";
		final double coste2 = 2.4;
		final int uds2 = 10;
		
		final double costeTotal = (coste1 * uds1) + (coste2 * uds2);
		
		cliente.setPedido(new Pedido(nombre1, uds1, coste1));
		cliente.setPedido(new Pedido(nombre2, uds2, coste2));
		
		assertEquals(costeTotal, cliente.calculaImportePedidos(), "El precio de varios pedidos no se corresponde con el valor correcto");
	}

}
