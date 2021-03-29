package severo.ed.debug;

public class AnalizadorPalabrasTesterLog {

	public static void main(String[] args) {
		test("missisippi"); // expect: i (not m or s)
		test("debug"); // expect: 0 (no duplicate letters)
		test("test"); // expect: t
	}

	public static void test(String s) {
		AnalizadorPalabras ap = new AnalizadorPalabras(s);
		char resultado = ap.primerCaracterRepetido();
		if (resultado == 0) {
			System.out.println("No hay caracteres repetidos.");
		} else {
			System.out.println("Primer caracter repetido = " + resultado);
		}
	}
}
