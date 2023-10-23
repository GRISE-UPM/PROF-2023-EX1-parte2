package es.upm.pablo.pablo2023;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PedidoTest {

    @Test
    public void testGetImportePedido() {
        
    	//Definino valores de prueba
        String item = "ProductoPablo";
        int unidades = 5;
        double precio = 10.0;
        
        // Creo un objeto Pedido con los valores de prueba
        Pedido pedido = new Pedido(item, unidades, precio);
        
        // Definino el valor esperado del importe del pedido
        double importeEsperado = unidades * precio;
        
        // Uso assert para verificar si el importe calculado es igual al valor esperado
        assertEquals(importeEsperado, pedido.getImportePedido(), 0.001); // Uso un delta pequeño para manejar la precisión de los números de punto flotante
    }
}