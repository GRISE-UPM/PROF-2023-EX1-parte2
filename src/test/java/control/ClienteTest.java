package control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ClienteTest {

	private Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente();
    }

    @Test
    public void testLanzarExcepcionCuandoNoHayPedidos() {
        assertThrows(NoHayPedidosException.class, () -> {
            cliente.calculaImportePedidos();
        });
    }

    @Test
    public void testCalculaImportePedidos() throws NoHayPedidosException {
        Pedido pedido1 = new Pedido("Producto1", 2, 10.0);
        Pedido pedido2 = new Pedido("Producto2", 3, 15.0);

        cliente.setPedido(pedido1);
        cliente.setPedido(pedido2);

        double importeEsperado = pedido1.getImportePedido() + pedido2.getImportePedido();
        double importeCalculado = cliente.calculaImportePedidos();
        assertEquals(importeEsperado, importeCalculado, 0.01); // Usar tolerancia para comparación de números de punto flotante
    }
}