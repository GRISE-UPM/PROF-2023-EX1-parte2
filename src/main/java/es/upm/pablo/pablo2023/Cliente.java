package es.upm.pablo.pablo2023;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private List<Pedido> pedidos;
	
	Cliente() {
		pedidos = new ArrayList<Pedido>();
	}
	
	public void setPedido(Pedido pedido) {
		pedidos.add(pedido);
	}

	public double calculaImportePedidos() throws NoHayPedidosException {
		
		double importe = 0;
		
		if(pedidos.isEmpty())
			throw new NoHayPedidosException();
		
		for(Pedido i : pedidos) {
			importe += i.getImportePedido();
		}
		
		return importe;
	}
	
}
