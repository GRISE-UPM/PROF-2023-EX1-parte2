package es.upm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PedidoTest {

    @Test
    public void testGetImportePedido() {
       
        Pedido pedido = new Pedido("P", 5, 10.0);
       
        double importeEsperado = 5 * 10.0;
        
        double importeReal = pedido.getImportePedido();

        assertEquals(importeEsperado, importeReal); 
        }
}