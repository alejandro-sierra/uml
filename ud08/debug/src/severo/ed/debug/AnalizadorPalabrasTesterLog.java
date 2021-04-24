package severo.ed.debug;

public class AnalizadorPalabrasTesterLog {

	public static void main(String[] args) {
		test("missisippi"); // expect: i (not m or s)
		test("debug"); // expect: 0 (no duplicate letters)
		test("test"); // expect: t
		test("contento"); // expect: o (not n or t)
	}

	public static void test(String s) {
		AnalizadorPalabras ap = new AnalizadorPalabras(s);
		char resultado = ap.primerCaracterMultiple();
		if (resultado == 0) {
			System.out.println("No hay caracteres multiples.");
		} else {
			System.out.println("Primer caracter multiple = " + resultado);
		}
	}
}
