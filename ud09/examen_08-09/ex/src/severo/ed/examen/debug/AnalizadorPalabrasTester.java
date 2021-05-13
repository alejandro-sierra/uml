package severo.ed.examen.debug;

public class AnalizadorPalabrasTester {


	public static void main(String[] args) {
		calcula();
		test("Probando"); // esperado:3
		test("kms"); // esperado: 0
		test("JAVA"); // esperado: 2
		test("Esto es un examen"); // esperado: 7
		test("Programacion"); // esperado: 5
	}

	public static void test(String s) {
		AnalizadorPalabras ap = new AnalizadorPalabras(s);
		int resultado = ap.analizar();
		if (resultado == 0) {
			System.out.println("No hay vocales.");
		} else {
			System.out.println("Vocales = " + resultado);
		}
	}

	public static void calcula() {
		int x = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				x += i * 2;
			} else {
				x -= i;
			}
		}
		System.out.println("Resultado calculado: " + x);
	}
}
