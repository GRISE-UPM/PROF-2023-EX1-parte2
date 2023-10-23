package es.upm.grise.prof.curso2023.control1.Control1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class ClienteTest {

	Cliente cliente;
	@BeforeEach
	void init() {
		cliente = new Cliente();
	}
	@Test
	@DisplayName("Verifica que salta un error cuando no hay pedido")
    public void NoHayPedidosExceptionTest() {
        assertThrows(NoHayPedidosException.class, () -> {
            cliente.calculaImportePedidos();
        });
    }

    @Test
	@DisplayName("Verifica que el importe de los pedidos realizados por un cliente sea correcto")
    public void testCalculaImportePedidosConPedidos() throws NoHayPedidosException {
        Pedido pedido1 = new Pedido("pedido1", 1, 100.0);
        Pedido pedido2 = new Pedido("pedido 2", 3, 150.0);
        
        cliente.setPedido(pedido1);
        cliente.setPedido(pedido2);
        
        double importeTotal = cliente.calculaImportePedidos();
        
        assertEquals(550.0, importeTotal);
    }
}