package com.upm.examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import com.upm.examen.Pedido;

class PedidosTest {
    Pedido pedido;

    @BeforeEach
    void setUp(){
        pedido = new Pedido("Prueba",10,20.0);
    }

	@Test
	void testPedidos() {
        double costeTotal = 200.0;
        assertEquals(costeTotal,pedido.getImportePedido());
	}

}