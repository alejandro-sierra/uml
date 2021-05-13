package severo.ed.examen.debug;

public class AnalizadorPalabras {
	
	private String palabra;

	public AnalizadorPalabras(String palabra) {
		this.palabra = palabra;
	}
	
	/**
	 *He añadido las vocales en mayusculas,  porque si no 'JAVA' no tendría vocales
	 *Y le que quitado el -1 a 'palabra.length() -1' para llegará hasta el final 
	 *de la palabra, porque con -1 no llegaba.
	 *
	 *He detectado los errores con un punto de ruptura en el momento en el que se llama 
	 *al metodo analizar en el main, y he visto que no recorria toda la palabra y que al 
	 *pasar por el if no habian mayusculas por lo que no la detectaba como vocales.
	 */
	public int analizar() {
		int c = 0;
		for (int i = 0; i < palabra.length(); i++) {
			char ch = palabra.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' 
					|| ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				c++;
			}
		}
		return c;
	}
}
