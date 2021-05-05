package severo.ed.calidad.patrones;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sumador {
	
	private int total;	

	private static final Logger LOGGER = LogFactory.getLogger(Sumador.class.getName());

	
	public Sumador() {
		this.total = 0;
	}
		
	public int getTotal() {
		return total;
	}


	public int sumarImpares(int cantidad) {
		int impar = 1;
		int suma = 0;

		while (cantidad >= 0) {
			suma += impar;
			impar += 2;
			cantidad--;
		}
		
		this.total += suma;

		return suma;
	}

	public static void main(String[] args) {
		
		Sumador s = new Sumador();
		int n = 5;

		int suma = s.sumarImpares(5);
		//System.out.println("La suma de los primeros " + n + " n�meros impares es " + suma + ".");
		LOGGER.info("La suma de los primeros " + n + " n�meros impares es " + suma + ".");

		n= 7;
		suma = s.sumarImpares(7);
		//System.out.println("La suma de los primeros " + n + " n�meros impares es " + suma + ".");
		LOGGER.log(Level.INFO, "La suma de los primeros " + n + " n�meros impares es " + suma + ".");
		
		//System.out.println("El total de las sumas es " + s.getTotal() + ".");		
		LOGGER.info("El total de las sumas es " + s.getTotal() + ".");
	}
}
