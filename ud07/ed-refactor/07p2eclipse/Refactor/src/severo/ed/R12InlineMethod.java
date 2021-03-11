package severo.ed;
/**
 * @author Alejandro Ballesta Sierras
 */

/**
 * En este caso vemos que tenenmos un metodo que llama a otro, para 
 * refactorizarlo ponemos el contenido del metodo al metodo que lo llama.
 */

/*
package severo.ed;

public class R12InlineMethod {

	public int cantidadEntregas;

	int getRating() {
		return masDe5Entregas() ? 2 : 1;
	}

	boolean masDe5Entregas() {
		return cantidadEntregas > 5;
	}

}

*/

public class R12InlineMethod {

	public int cantidadEntregas;

	int getRating() {
		return cantidadEntregas > 5 ? 2 : 1;
	}
}
