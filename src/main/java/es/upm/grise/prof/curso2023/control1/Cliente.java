package es.upm.grise.prof.curso2023.control1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private List<Pedido> pedidos;
	
	public Cliente() { // arreglado: hecho público el método
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
