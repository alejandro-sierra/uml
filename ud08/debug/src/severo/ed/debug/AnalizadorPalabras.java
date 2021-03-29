package severo.ed.debug;

public class AnalizadorPalabras {

	private String palabra;

	public AnalizadorPalabras(String palabra) {
		this.palabra = palabra;
	}

	/**
	 * Obtiene el primer caracter repetido. 
	 * Se considera <i>repetido</i>s si hay dos al menos dos ocurrencias adyacentes.
	 * Por ejemplo, la "l" se repite en "paella", pero no la "a".
	 * 
	 * @return El primer caracter repetido, si no, 0.
	 */
	public char primerCaracterRepetido() {
		for (int i = 0; i < palabra.length(); i++) {
			char ch = palabra.charAt(i);
			if (ch == palabra.charAt(i + 1))
				return ch;
		}
		return 0;
	}

	/**
	 * Gets the first multiply occuring character. A character is <i>multiple</i> if
	 * it occurs at least twice in the word, not necessarily in adjacent positions.
	 * For example, both 'o' and 'l' are multiple in "hollow", but 'h' is not.
	 * 
	 * @return the first repeated character, or 0 if none found
	 */
	public char firstMultipleCharacter() {
		for (int i = 0; i < palabra.length(); i++) {
			char ch = palabra.charAt(i);
			if (encontrar(ch, i) >= 0)
				return ch;
		}
		return 0;
	}

	private int encontrar(char caracter, int posicion) {
		for (int i = posicion; i < palabra.length(); i++) {
			if (palabra.charAt(i) == caracter) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Cuenta los grupo de caracteres repetidos. 
	 * Por ejemplo, "mississippi!!!" tiene 4 grupos: ss, ss, pp and !!!.
	 * 
	 * @return número de grupos de caracteres repetidos
	 */
	public int contarCaracteresRepetidos() {
		int c = 0;
		for (int i = 1; i < palabra.length() - 1; i++) {
			if (palabra.charAt(i) == palabra.charAt(i + 1)) // encuentra una repetición
			{
				if (palabra.charAt(i - 1) != palabra.charAt(i)) // es el inicio
					c++;
			}
		}
		return c;
	}

}
