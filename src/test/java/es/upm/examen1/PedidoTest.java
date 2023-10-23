package es.upm.examen1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    Pedido pedido;
    
    @BeforeEach
    public void initPedido(){
        pedido = new Pedido("pedido", 5, 254.0);
    }

    @Test
    public void getImportePedido(){
        double spected = 254.0;
        assertEquals(spected, pedido.getImportePedido());
    }
}
