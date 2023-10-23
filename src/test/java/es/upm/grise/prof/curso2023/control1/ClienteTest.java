package es.upm.grise.prof.curso2023.control1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

public class ClienteTest {

    Cliente cliente_test;

    private static final String ITEM_NAME = "Sample Item";
    private static final int UNITS = 5;
    private static final double PRICE = 10.0;
    private static final double DELTA = 0.0001; // Delta for double comparison

    @BeforeEach
    void makeCliente(){
        cliente_test = new Cliente();
    }
    @Test
    public void testNoPedidos() {
        assertThrows(NoHayPedidosException.class, () -> cliente_test.calculaImportePedidos());
    }

    @Test
    public void testCalculaImporte() {
        Pedido pedido = new Pedido(ITEM_NAME, UNITS, PRICE);
        Pedido pedido2 = new Pedido(ITEM_NAME, UNITS+3, PRICE+4.0);
        double expectedImporte = UNITS * PRICE + (UNITS+3)*(PRICE+4.0);
        cliente_test.setPedido(pedido);
        cliente_test.setPedido(pedido2);
        try {
            assertEquals(expectedImporte, cliente_test.calculaImportePedidos());
        } catch (NoHayPedidosException e) {
            fail();
        }
    }
}
