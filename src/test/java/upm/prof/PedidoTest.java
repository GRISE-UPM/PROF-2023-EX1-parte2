package upm.prof;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PedidoTest {

	@Test
	public void testImporte() {
		String nombre = "Calcetines";
		final double precioUd = 2.5;
		final int uds = 8;
		double valorCorrecto = precioUd * uds;
		
		Pedido pedido = new Pedido(nombre, uds, precioUd);
		
		assertEquals(valorCorrecto, pedido.getImportePedido(), "El precio calculado no se corresponde al esperado");
	}

}
