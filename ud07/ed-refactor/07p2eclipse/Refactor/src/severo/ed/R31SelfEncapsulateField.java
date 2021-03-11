package severo.ed;

/**
 * 
 * @author Alejandro Ballesta Sierras
 */

/**
 * Para poder acceder a unos campos privados de una clase necesitamos los 
 * getters y los setters, porque si no, no podemos acceder a ellos desde otras
 * clases.
 */

/*
public class R31SelfEncapsulateField {

	private int bajo, alto;

	boolean incluye(int arg) {
		return arg >= bajo && arg <= alto;
	}

}
*/

public class R31SelfEncapsulateField {

	private int bajo, alto;

	boolean incluye(int arg) {
		return arg >= getBajo() && arg <= getAlto();
	}
        int getBajo() {
            return bajo;
        }
        int getAlto() {
            return alto;
        }

}