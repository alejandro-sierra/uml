package severo.ed.debug;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AnalizadorPalabras {

	private String palabra;

	public AnalizadorPalabras(String palabra) {
		this.palabra = palabra;
	}
 
	/**
	 * Obtiene el primer caracter repetido. Se considera <i>repetido</i>s si hay dos
	 * al menos dos ocurrencias adyacentes. Por ejemplo, la "l" se repite en
	 * "paella", pero no la "a".
	 * 
	 * @return El primer caracter repetido, si no, 0.
	 */
	public char primerCaracterRepetido() {
		for (int i = 0; i < palabra.length()-1; i++) { 
			char ch = palabra.charAt(i);
			if (ch == palabra.charAt(i + 1))
				return ch;
		}
		return 0;
	}

	/**
	 * Obtiene la primera ocurrencia múltiple de un caracter.
	 * Un caracter es <i>multiple</i> si aparece al menos dos veces en la palabra,
	 * no necesariamente en posiciones contiguas. Por ejemplo, en "contento", 
	 * tanto la no' como la 't' y la 'o' serían múltiples.
	 * 
	 * @return el primer caracter múltiple, o 0 si no encuentra ninguno
	 */
	public char primerCaracterMultiple() {
		for (int i = 0; i < palabra.length(); i++) {
			char ch = palabra.charAt(i);
			if (encontrar(ch, i) >= 0)
				return ch;
		}
		return 0;
	}

	private int encontrar(char caracter, int posicion) {
		LOGGER.info("Entrando a encontrar con caracter ="+caracter+" y posicion ="+posicion);
		for (int i = posicion; i < palabra.length(); i++) {
			if (palabra.charAt(i) == caracter) {
				return i;
				//LOGGER.info("Saliendo de encontrar con i=");
			}
		}
		return -1;
	}

	/**
	 * Cuenta los grupo de caracteres repetidos. Por ejemplo, "mississippi!!!" tiene
	 * 4 grupos: ss, ss, pp and !!!.
	 * 
	 * @return nï¿½mero de grupos de caracteres repetidos
	 */
	public int contarCaracteresRepetidos() {
		int c = 0;
		for (int i = 0; i < palabra.length() - 1; i++) {
			if (palabra.charAt(i) == palabra.charAt(i + 1)) // encuentra una repeticion
			{
				if (i==0 ||palabra.charAt(i - 1) != palabra.charAt(i)) // es el inicio
					c++;
			}
		}
		return c;
	}
	
	private final static Logger LOGGER = Logger.getLogger(AnalizadorPalabras.class.getName());


	public void configurarLog() throws SecurityException, IOException {
		
		// Creamos un manejador por consola que lo muestra todo
		//Handler consoleHandler = new ConsoleHandler();
		//consoleHandler.setLevel(Level.ALL);
		//LOGGER.addHandler(consoleHandler);
		
		// El manejador a fichero a partir de INFO
		Handler file = new FileHandler("analizadPalabras.log");	
		SimpleFormatter simpleFormatter = new SimpleFormatter();
		file.setFormatter(simpleFormatter);
		file.setLevel(Level.INFO);
		LOGGER.addHandler(file);
		
		LOGGER.setLevel(Level.FINE);
	}
}
