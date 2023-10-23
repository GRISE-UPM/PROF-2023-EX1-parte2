package es.upm.lluise.examen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;


class PedidoTest {
    private Pedido pedido;

    @BeforeEach
    public void beforeAll() {
        final double PRICE = 2.0;
        final int UNITS = 5;
        final String NAME = "Patatas";

        this.pedido = new Pedido(NAME, UNITS, PRICE);
    }

    @Test
    @DisplayName("Check Pedido importe")
    public void test_import() {
        final double EXPECTED_IMPORT = 10.0;
        assertEquals(EXPECTED_IMPORT,
                     this.pedido.getImportePedido(),
                     "Check Pedido importe");
    }
}
