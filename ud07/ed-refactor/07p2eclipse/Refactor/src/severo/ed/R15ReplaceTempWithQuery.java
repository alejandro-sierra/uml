package severo.ed;

/**
 * 
 * @author Alejandro Ballesta Sierras
 */

/**
 * Tenemos creada una variable para calcular el precio base, pero es mejor 
 * opción crear un metodo para calcular el precio base y que otros metodos
 * llamen a este. De esta forma podremos reutilizar este metodo precioBase().
*/

/*
package severo.ed;

public class R15ReplaceTempWithQuery {

	private int precioElemento;
	private int cantidad;

	double calculaTotal() {
		double precioBase = cantidad * precioElemento;
		if (precioBase > 1000) {
			return precioBase * 0.95;
		} else {
			return precioBase * 0.98;
		}
	}
}

*/

public class R15ReplaceTempWithQuery {

	private int precioElemento;
	private int cantidad;

	double calculaTotal() {
		if (precioBase() > 1000) {
			return precioBase() * 0.95;
		} else {
			return precioBase() * 0.98;
		}
        }
        double precioBase(){
            return cantidad * precioElemento;
        }
}
