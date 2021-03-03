package severo.ed;

/**	
 * 
 * @author Alejandro Ballesta Sierras
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
