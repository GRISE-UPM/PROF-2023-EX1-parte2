package examen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    public void testCalculaImportePedidosException() {
        Cliente cliente = new Cliente();
        assertThrows(NoHayPedidosException.class, cliente::calculaImportePedidos);
    }

    @Test
    public void testCalculaImportePedidos() throws NoHayPedidosException {
        Cliente cliente = new Cliente();
        Pedido pedido1 = new Pedido("ped1",1,15.0);
        Pedido pedido2 = new Pedido("ped1",1,20.0);
        double result = 35.0;
        cliente.setPedido(pedido1);
        cliente.setPedido(pedido2);
        assertEquals(result, cliente.calculaImportePedidos());
    }
}
