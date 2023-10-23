import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testExcepcionCuandoNoHayPedidos() {
        Cliente cliente = new Cliente();
        assertThrows(NoHayPedidosException.class, () -> cliente.calculaImportePedidos());
    }

    @Test
    public void testCalculoImportePedidos() throws NoHayPedidosException {
        Pedido pedido1 = new Pedido("Producto1", 2, 10.0);
        Pedido pedido2 = new Pedido("Producto2", 3, 5.0);
        double importeEsperado = 35.0;

        Cliente cliente = new Cliente();
        cliente.setPedido(pedido1);
        cliente.setPedido(pedido2);

        assertEquals(importeEsperado, cliente.calculaImportePedidos(), "El cálculo del importe total de los pedidos no es correcto.");
    }
}