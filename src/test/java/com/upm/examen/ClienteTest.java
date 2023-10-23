package com.upm.examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import com.upm.examen.Cliente;
import com.upm.examen.Pedido;

class ClienteTest {

    Cliente cliente;
    Pedido pedido;

    @BeforeEach
    void setUp(){
        cliente = new Cliente();
        pedido = new Pedido("Comida",10,20.0);
    }

	@Test
	void testCoste() {
        double coste = 200.0;
        cliente.setPedido(pedido);
        try{
            assertEquals(coste,cliente.calculaImportePedidos());
        } catch(Exception e){}
	}

    @Test
    void testNoPedido() {
        assertThrows(NoHayPedidosException.class,() -> cliente.calculaImportePedidos());
    }

}