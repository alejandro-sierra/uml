package severo.ed.calidad.doc;

/**
 * Clase que define el nombre y la velocidad de un tren
 * @author Alejandro Ballesta Sierras
 * @version 1.0
 */

public class Tren {

	private String nombre;
	private int velocidad;
	private static final int MAX_VELOCIDAD = 500;

	/**
	 * Contrucotr de la clase
	 * @param unNombre nombre del tren
	 */
	public Tren(String unNombre) {
		nombre = unNombre;
		velocidad = 0;
	}

	/**
	 * Nos pide la velocidad a aumentar
	 * @param masKMH velocidad que debe aumentar
	 */
	public void acelerar(int masKMH) {
		comprobarVelocidadMaxima(velocidad + masKMH);
		velocidad += masKMH;
	}

	/**
	 * Nos pide la velocidad a reducir
	 * @param menosKMH velocidad a reducir
	 */
	public void decelerar(int menosKMH) {
		comprobarVelocidadMinima(velocidad - menosKMH);
		velocidad -= menosKMH;
	}

	/**
	 * Devuelve si esta en movimiento o no
	 * @return true o false
	 */
	public boolean estaMoviendo() {
		return (velocidad != 0);
	}
	
	/**
	 * Metodo que sirve para bajar la velocidad hasta 0
	 */
	public void detener() {
		velocidad = 0;
	}

	/**
	 * Son devulve el nombre asignado al tren
	 * @return nombre asignado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Nos devukve la velocidad actual
	 * @return velicidad son da la velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Comprueba la velocidad maxima
	 * @param newSpeed la velocidad maxima que queremos comprobar
	 */
	private void comprobarVelocidadMaxima(int newSpeed) {
		if (newSpeed > MAX_VELOCIDAD) {
			throw new IllegalArgumentException("No puede ir a mas de " + MAX_VELOCIDAD + ".");
		}
	}
	
	/**
	 * Compueba la velocidad minima
	 * @param newSpeed la velocidad minima que queremos comprobar
	 */
	private void comprobarVelocidadMinima(int newSpeed) {
		if (newSpeed <= 0) {
			throw new IllegalArgumentException("can't have negative speed.");
		}
	}
	
	/**
	 * Imprime los datos de la clase
	 * @return nombre del tren y velocidad actual
	 */
	public String toString() {
		return "[Tren " + nombre + " circula a " + velocidad + " KMH]";
	}
}
