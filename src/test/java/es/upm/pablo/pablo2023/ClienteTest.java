package es.upm.pablo.pablo2023;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente();
    }

    @Test
    public void testLanzarExcepcionCuandoNoHayPedidos() throws NoHayPedidosException {
        // Verifico que se lanza NoHayPedidosException cuando no hay pedidos
        Assertions.assertThrows(NoHayPedidosException.class,()-> cliente.calculaImportePedidos());
    }

    @Test
    public void testCalcularImportePedidos() throws NoHayPedidosException {
        // Agrego pedidos al cliente
        Pedido pedido1 = new Pedido("PrimerProducto", 3, 10.0);
        Pedido pedido2 = new Pedido("SegundoProducto", 2, 8.0);
        cliente.setPedido(pedido1);
        cliente.setPedido(pedido2);
        
        // Calculo el importe esperado
        double importeEsperado = (pedido1.getImportePedido() + pedido2.getImportePedido());
        
        // Verifico que el importe calculado sea igual al importe esperado
        assertEquals(importeEsperado, cliente.calculaImportePedidos(), 0.001);
    }
}
