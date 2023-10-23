package es.upm.alumnos.alonso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PedidoTest { 

    @Test
    void testHacerPedido(){
        int UNO=1;
        int DIEZ=10;

        Pedido pedido = new Pedido("Pedido 1", UNO, DIEZ);
        assertEquals(DIEZ, pedido.getImportePedido(), "Un pedido de 10 euros cuesta 10");
    }
}
