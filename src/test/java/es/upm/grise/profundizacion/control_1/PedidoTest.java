package es.upm.grise.profundizacion.control_1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    
    static Pedido p;

  

    @Test
	public void crearPedido() {
        String nombrePedido = "Un pedido";
        int unidades = 10;
        double precio = 2.5;
        double importeEsperado = 25;
        Pedido p = new Pedido(nombrePedido, unidades, precio);
        assertEquals(importeEsperado, p.getImportePedido(), "Error, el importe del pedido debería ser 25");
    }

    @Test
	public void crearPedido2() {
        String nombrePedido = "Otro pedido";
        int unidades = 250;
        double precio = 2.3;
        double importeEsperado = 575;
        Pedido p = new Pedido(nombrePedido, unidades, precio);
        assertEquals(importeEsperado, p.getImportePedido(), "Error, el importe del pedido debería ser 575");
    }


}
