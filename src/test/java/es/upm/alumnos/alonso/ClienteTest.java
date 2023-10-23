package es.upm.alumnos.alonso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    
    Cliente cliente;

    @BeforeEach
    void crearCliente(){
        cliente = new Cliente();
    }

    @Test
    void testClienteException(){
        assertThrows(NoHayPedidosException.class, () -> cliente.calculaImportePedidos(), "No hay clientes por lo tanto lanza excepcion");
    }

    @Test
    void testImporteCliente(){
        cliente.setPedido(new Pedido("Pedido 1", 1, 2));
        cliente.setPedido(new Pedido("Pedido 2", 2, 1));

        int CUATRO=4;
        try {
            assertEquals(CUATRO, cliente.calculaImportePedidos(), "El precio de los dos pedidos es 4");
        } catch (NoHayPedidosException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }    
}
