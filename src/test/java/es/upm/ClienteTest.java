package es.upm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ClienteTest {

    private static Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente();
    }

    @Test
    public void testSinPedidos() {
        assertThrows(NoHayPedidosException.class, () -> {
            cliente.calculaImportePedidos();
        });
    }

    @Test
    public void testConPedidos() {
    	double sol =100.0;
    	Pedido pedido = new Pedido("P", 1, sol);      
        cliente.setPedido(pedido);
        assertDoesNotThrow(() -> {
            double importe = cliente.calculaImportePedidos();
            assertEquals(sol, importe); 
        });
    }
}
