package es.upm.grise.prof.curso2023.control1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PedidoTest {

    private static final String ITEM_NAME = "Sample Item";
    private static final int UNITS = 5;
    private static final double PRICE = 10.0;
    private static final double DELTA = 0.0001; // Delta for double comparison

    @Test
    public void testGetImportePedido() {
        Pedido pedido = new Pedido(ITEM_NAME, UNITS, PRICE);
        double expectedImporte = UNITS * PRICE;
        assertEquals(expectedImporte, pedido.getImportePedido(), DELTA);
    }
}
