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


class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    public void beforeAll() {
        final double PRICE_1 = 2.0;
        final int UNITS_1 = 5;
        final String NAME_1 = "Patatas";
        Pedido pedido1 = new Pedido(NAME_1, UNITS_1, PRICE_1);

        final double PRICE_2 = 3.0;
        final int UNITS_2 = 3;
        final String NAME_2 = "Albondigas";
        Pedido pedido2 = new Pedido(NAME_2, UNITS_2, PRICE_2);

        this.cliente = new Cliente();
        this.cliente.setPedido(pedido1);
        this.cliente.setPedido(pedido2);
    }

    @Test
    @DisplayName("Check Cliente importe")
    public void test_import() throws NoHayPedidosException {
        final double EXPECTED_IMPORT = 19.0;
        assertEquals(EXPECTED_IMPORT,
                     this.cliente.calculaImportePedidos(),
                     "Check Cliente importe");
    }

    @Test
    @DisplayName("Check Cliente NoHayPedidosException")
    public void test_nopedidos_exception() {
        Cliente cli = new Cliente();
        // https://www.baeldung.com/junit-assert-exception
        assertThrows(NoHayPedidosException.class, () -> {
                cli.calculaImportePedidos();
            });
    }
}
