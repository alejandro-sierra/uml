package severo.ed.calidad.doc;

/**
 * Clase para probar la clase Tren
 * @author Alejandro Ballesta Sierras
 * @version 1.0
 */

public class TrenTester {
	public static void main(String[] args) {
		/**
		 * Agregamos el nuevo tren con el contructor de la clase
		 * la cual le da el nombre asignado y el valor de 0 a la velocidad
		 */
		Tren tren = new Tren("mamifero1");
		
		/**
		 * Ahora aceleramos el tren en  90 km/h
		 */
		tren.acelerar(90);
		
		/**
		 * Imprimimos los datos con el toString
		 */
		System.out.println(tren.toString());
		
		/**
		 * Preguntamos si esta en movimiento
		 */
		tren.estaMoviendo();
		
		/**
		 * Reducimos su velocidad en 10 km/h
		 */
		tren.decelerar(10);
		
		/**
		 * Comprobamos tanto la velocidad maxima a la que puede ir como la minima
		 * dandole unos valores fuera de los permitidos
		 */
		//tren.acelerar(600);
		//tren.decelerar(100);
		
		/**
		 * Detenemos el tren vandole el valor de 0 a la velocidad
		 */
		tren.detener();
		
		/**
		 * Y volvemos a imprimir con toString
		 */
		System.out.println(tren.toString());
	}
}
