package examen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    @Test
    public void testGetImportePedido() {
        Pedido pedido = new Pedido("item", 2, 50.0);
        double expected = 100.0;
        double actual = pedido.getImportePedido();
        assertEquals(expected, actual, "El importe del pedido debería ser 100.0");
    }
}