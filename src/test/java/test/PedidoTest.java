package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.examen.primera.Pedido;

class PedidoTest {

	Pedido pedido = new Pedido("Producto A", 3, 10.0);
	

	 @Test
	 @DisplayName("Probando que los importes se calculen bien")   
	 public void testGetImportePedido() {
	        
	        double importePedido = pedido.getImportePedido();
	        double importeFinal=30;
	        
	        assertEquals(importeFinal, importePedido,"El importe no se calcula correctamente");
	    }
}
