package es.upm.examen1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ClienteTest {
    @Test
    public void noPedidosTest(){
        Cliente cliente = new Cliente();
        assertThrows(NoHayPedidosException.class, () -> {
            cliente.calculaImportePedidos();
        });

    }

    @Test
    public void calculoPedidos(){
        Cliente cliente = new Cliente();
        Pedido pedido = new Pedido("ped1",1,5.0);
        Pedido pedido2 = new Pedido("ped2",2,25.0);

        cliente.setPedido(pedido);
        cliente.setPedido(pedido2);

        Double spected = 55.0;

        try {
            assertEquals(spected,cliente.calculaImportePedidos());
        } catch (NoHayPedidosException e) {
            e.printStackTrace();
        }
    }
}
