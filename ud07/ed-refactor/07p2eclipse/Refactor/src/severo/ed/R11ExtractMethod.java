package severo.ed;

/**	
 * 
 * @author Alejandro Ballesta Sierras
 */

/**
*El problema que teniamos aqui es que teniamos el parte del codigo fragmentado y
*podemos agrupar lo en un metodo nuevo para hacer el codigo mas sencillo y con 
* la posibilidad de reutilizar dicho metodo.
*/

/*
package severo.ed;

public class R11ExtractMethod {

	private String nombre;

	void imprimirPropietario() {
		imprimirCartel();

		// Imprimir detalles
		System.out.println("nombre: " + nombre);
		System.out.println("cantidad: " + getSobrante());
	}

	private String getSobrante() {
		return null;
	}

	private void imprimirCartel() {
	}

}
*/

public class R11ExtractMethod {

	private String nombre;

	void imprimirPropietario() {
		imprimirCartel();
		imprimirDetalles();
	}
	
	void imprimirDetalles(){
			System.out.println("nombre: " + nombre);
			System.out.println("cantidad: " + getSobrante());
	}
			
	private String getSobrante() {
		return null;
	}

	private void imprimirCartel() {
	}

}
