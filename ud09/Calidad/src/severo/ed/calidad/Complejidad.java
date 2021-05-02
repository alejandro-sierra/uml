package severo.ed.calidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Complejidad {

	public void ejercicio1(int x, int y) {
		int result;
		if (x < 0 || y < 0) {
			System.out.println("X o Y son negativos");
		} else {
			result = (x + y) / 2;
			System.out.println("La media de X e Y es:" + result);
		}
	}

	public int ejercicio2(int x, int y) {
		int result;
		if (x < 0 || y < 0) {
			System.out.println("X o Y son negativos");
			result = -1;
		} else if (x == 1 || y == 1) {
			result = 1;
		} else {
			while (x != y) {
				if (x > y) {
					x = x - y;
				} else {
					y = y - x;
				}
			}
			result = x;
		}
		return result;
	}
/**
 *Tenemos una complejidad de 6
*/
	public int ejercicio3(int tam) {
		int[] array; 
		if (tam > 0) {
			array = new int[10];
		} else {
			throw new IllegalArgumentException("Tama�o no v�lido");
		}
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		// Inicializacion del array
		int i;
		InitArray(array, input);
		// Suma del array
		result = SumaArray(array, result);
		
		return result;
	}

/**
 * Extraemos el metodo del ejrcicio3
 * @param array de int
 * @param result
 * @return un int
 */
public int SumaArray(int[] array, int result) {
	int i;
	System.out.println("Suma: ");
	for (i = 0; i < array.length; i++) {
		result = result + array[i];
		System.out.print(array[i] + " " + (i == array.length - 1 ? " " : "+ "));
	}
	System.out.println("= " + result);
	return result;
}

/**
 * Extraemos el metodo del ejercicio3
 * @param array de int
 * @param input
 */
public void InitArray(int[] array, BufferedReader input) {
	int i = 0;
	while (i < array.length) {			
		System.out.printf("Introduce el valor para array[%d]", i);
		try {
			array[i] = Integer.valueOf(input.readLine());
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		if (i < array.length) {
			i++;
		}
	}
}

}