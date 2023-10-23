package control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class PedidoTest {

    @Test
    public void testGetImportePedido() {
        Pedido pedido = new Pedido("Producto", 5, 10.0);
        double expectedImporte = 5 * 10.0;
        assertEquals(expectedImporte, pedido.getImportePedido(), 0.001);
    }
}