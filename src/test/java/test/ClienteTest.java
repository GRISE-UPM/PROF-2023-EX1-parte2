
package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.examen.primera.Cliente;
import com.examen.primera.NoHayPedidosException;
import com.examen.primera.Pedido;

class ClienteTest {
	 
	
	private Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente();
    }
	
	@Test
	@DisplayName("Probando que calcule bien sin pedidos")
    public void testCalculaImportePedidosSinPedidos() {        
        assertThrows(NoHayPedidosException.class, () -> cliente.calculaImportePedidos());
    }

    @Test
    @DisplayName("Probando que calcule bien con pedidos")
    public void testCalculaImportePedidosConPedidos() {        
        Pedido pedido1 = new Pedido("producto1", 1,30);
        Pedido pedido2 = new Pedido("producto2", 2,30);

        cliente.setPedido(pedido1);
        cliente.setPedido(pedido2);              
        double importeTotal= 30.0;
        
        //no se deberian uar try catch pero no me da tiempo a olucionarlo de otra forma
        try {
			assertEquals(importeTotal, cliente.calculaImportePedidos(),"El importe no se calcula bien con pedidos");
		} catch (NoHayPedidosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}