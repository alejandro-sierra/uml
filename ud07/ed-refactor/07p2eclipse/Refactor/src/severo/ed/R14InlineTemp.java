package severo.ed;

import severo.ed.helpers.Pedido;

/**
 * 
 * @author Alejandro Ballesta Sierras
 */

/**
 * Tenemos una variable temporal que podemos quitarnos si declaramos el return 
 * del metodo en la misma linea dandole directamente valor a la variable, sin
 * variables temporales.
*/

/*
package severo.ed;

import severo.ed.helpers.Pedido;

public class R14InlineTemp {

	boolean tieneDescuento(Pedido pedido) {
		  double precioBase = pedido.precioBase();
		  return precioBase > 1000;
	}
	
}

*/

public class R14InlineTemp {

	boolean tieneDescuento(Pedido pedido) {
		 return pedido.precioBase() > 1000;
	}
	
}
