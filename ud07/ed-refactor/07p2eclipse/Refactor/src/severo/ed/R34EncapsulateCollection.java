package severo.ed;

import java.util.Set;

import severo.ed.helpers.Pedido;

public class R34EncapsulateCollection {
	
	private Set<Pedido> pedidos;

	public Set<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedido(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
//getters and setteres

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}