package severo.ed.examen.sonar;
/**
 * Clase que crear un punto
 * @author Alejandro Ballesta Sierras
 * @version 1.0
 *
 */
public class Punto {
	
	private int x;
	private int y;

	/**
	 * Devulve el valor de la x
	 * @return el valor de la x
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * Pide el valor de la x
	 * @param valor pedido de la x
	 */
	public void setX(int valor) {
		this.x = valor;
	}

	/**
	 * Devulve el valor de y
	 * @return valor de la y
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * Pide el  valor de la y
	 * @param valor valor de la y
	 */
	public void setY(int valor) {
		this.y = valor;
	}

	/**
	 * Calcula la distancia entre puntos
	 * @param otro segundo punto para referenciar la distancia
	 * @return punto principal para referenciar la distancia
	 */
	public double distancia(Punto otro) {
		double dx = this.x - (double)otro.x;
		double dy = this.y - (double)otro.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

}

//El javadoc esta en la ruta E:\Users\MSI\Desktop\ede\ud09\examen_08-09\ex\doc\severo\ed\examen\sonar
//Por si un caso :)