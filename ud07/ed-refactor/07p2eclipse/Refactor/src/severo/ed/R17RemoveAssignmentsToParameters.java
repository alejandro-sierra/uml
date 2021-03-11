package severo.ed;

/**
 * 
 * @author Alejandro Ballesta Sierras
 */

/**
 * Se le estaba asignando un valor a un paramentro dentro del cuerpo, utilizamos
 * una variable local en lugar de un parametro.
 */

/*
package severo.ed;

public class R17RemoveAssignmentsToParameters {
	
	int descuento(int valorEntrada, int cantidad) {
		if (cantidad > 50) {
			valorEntrada -= 2;
		}
		// ...

		return valorEntrada * cantidad;
	}
}
*/

public class R17RemoveAssignmentsToParameters {
	
	int descuento(int valorEntrada, int cantidad) {
            int resultado = valorEntrada;
            if (cantidad > 50) {
                resultado -= 2;
		}
		// ...

		return valorEntrada * cantidad;
	}
}
