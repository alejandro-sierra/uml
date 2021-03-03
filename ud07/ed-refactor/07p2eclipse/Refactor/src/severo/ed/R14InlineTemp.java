package severo.ed;

import severo.ed.helpers.Pedido;

public class R14InlineTemp {

	boolean tieneDescuento(Pedido pedido) {
		  double precioBase = pedido.precioBase();
		  return precioBase > 1000;
	}
	
}
