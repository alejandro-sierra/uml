package severo.ed.calidad.doc;

public class Tren {

	private String nombre;
	private int velocidad;
	private static final int MAX_VELOCIDAD = 500;

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
		comprobraVelocidadMinima(velocidad - menosKMH);
		velocidad -= menosKMH;
	}

	/**
	 * Devuelve si esta en movimiento o no
	 * @return true o false
	 */
	public boolean estaMoviendo() {
		return (velocidad != 0);
	}

	public void detener() {
		velocidad = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}

	private void comprobarVelocidadMaxima(int newSpeed) {
		if (newSpeed > MAX_VELOCIDAD) {
			throw new IllegalArgumentException("No puede ir a m�s de " + MAX_VELOCIDAD + ".");
		}
	}

	private void comprobraVelocidadMinima(int newSpeed) {
		if (newSpeed <= 0) {
			throw new IllegalArgumentException("can't have negative speed.");
		}
	}

	public String toString() {
		return "[Tren " + nombre + " circula a " + velocidad + " KMH]";
	}
}
