import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void testCalculoImportePedido() {
        String item = "ProductoEjemplo";
        int unidades = 5;
        double precioPorUnidad = 20.0;
        double importeEsperado = unidades * precioPorUnidad;
        Pedido pedido = new Pedido(item, unidades, precioPorUnidad);
        assertEquals(importeEsperado, pedido.getImportePedido(), "El cálculo del importe del pedido no es correcto.");
    }
}