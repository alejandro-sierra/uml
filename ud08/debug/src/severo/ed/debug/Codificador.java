package severo.ed.debug;

import java.util.Scanner;

public class Codificador {

	private static int cantidadVocales;
	private static int clave;
	private static StringBuilder mensaje;

	public Codificador(String texto, int clave) {
		Codificador.clave = clave;
		Codificador.mensaje = new StringBuilder(texto);
	}

	public static void codificar() {
		int i = 0;
		int x = 0;
		int longitud = Codificador.mensaje.length();
		while (i < longitud) {
			int valorInt = (int) Codificador.mensaje.charAt(i);
			int valorCodificado = valorInt + Codificador.clave * Codificador.cantidadVocales;
			while (valorCodificado > 126) {
				x = valorCodificado - 126;
				valorCodificado = x + 31;
			}
			while (valorCodificado < 32) {
				x = 31 - valorCodificado;
				valorCodificado = 126 - x;
			}
			char caracterCodificado = (char) valorCodificado;
			Codificador.mensaje.setCharAt(i, caracterCodificado);

			i++;

		}

		System.out.println(mensaje);

	}

	public static void decodificar() {
		int i = 0;
		int x = 0;
		int longitud = Codificador.mensaje.length();
		while (i < longitud) {
			int valorEntero = (int) Codificador.mensaje.charAt(i);
			int valorCodificado = valorEntero - Codificador.clave * Codificador.cantidadVocales;
			while (valorCodificado > 126) {
				x = valorCodificado - 126;
				valorCodificado = x + 31;
			}
			while (valorCodificado < 32) {
				x = 31 - valorCodificado;
				valorCodificado = 126 - x;
			}
			char caracterCodificado = (char) valorCodificado;
			mensaje.setCharAt(i, caracterCodificado);

			i++;
		}
		System.out.println(mensaje);
	}

	public static void main(String args[]) {
		Codificador.cantidadVocales = 0;
		int numeroDeCaracteres;
		char letra;
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce el mensaje: ");
		String s = in.nextLine();
		System.out.print("Introduce la clave:");
		clave = in.nextInt();
		numeroDeCaracteres = s.length();

		for (int i = 0; i < numeroDeCaracteres; i++) {
			letra = s.charAt(i);
			if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I'
					|| letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U') {
				Codificador.cantidadVocales++;
			}
		}

		Codificador.mensaje = new StringBuilder(s);
		System.out.print("Quieres codificar o decodificar [C/D]?: ");
		String string1Input = in.next();

		if (string1Input.equals("C")) {
			codificar();
		}
		if (string1Input.equals("D")) {
			decodificar();
		}
		while (!string1Input.equals("D") && !string1Input.equals("C")) {
			System.out.println("Opción incorrecta");
			System.out.print("Quieres codificar o decodificar [C/D]?: ");
			string1Input = in.next();

			if (string1Input.equals("C")) {
				codificar();
			}
			if (string1Input.equals("D")) {
				decodificar();
			}
		}
		in.close();
	}

}
