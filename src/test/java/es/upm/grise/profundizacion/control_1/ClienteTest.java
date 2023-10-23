package es.upm.grise.profundizacion.control_1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ClienteTest {

    static final Pedido[] pedidos = new Pedido[]{new Pedido("Paquete1",10,100),new Pedido("Paquete2",20,100),new Pedido("Paquete3",30,100)};


    @Test
	public void lanzarExcepcionEnCasoDeNoHaberPedidos() {
		Cliente c = new Cliente();
		assertThrows(NoHayPedidosException.class,() -> c.calculaImportePedidos(), "Error, el método calculaImportePedidos debería lanzar excepción, no se ha añadido pedido");	
	}

    @Test
	public void calcularCorrectamenteValorDePedidos() throws NoHayPedidosException {
		Cliente c = new Cliente();
        addImporte(pedidos, c);
        double importeEsperado = 6000;
        assertEquals(importeEsperado, c.calculaImportePedidos(),  "Error, el valor esperado del importe debe ser 6000");
    }

    private void addImporte(Pedido[] pedidos, Cliente cliente) {
		for (Pedido pedido : pedidos) {
            cliente.setPedido(pedido);
        }
	}

    



}
