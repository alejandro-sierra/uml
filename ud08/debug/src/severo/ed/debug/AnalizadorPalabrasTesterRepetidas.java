package severo.ed.debug;

public class AnalizadorPalabrasTesterRepetidas {

	public static void main(String[] args) {
		test("mississippiii"); // expect: 4 (ss, ss, pp, iii)
		test("test"); // expect: 0 (sin letras repetidas)
		test("aabbcdaaaabb"); // expect: 4 (aa, bb, aaaa, bb)
	}

	public static void test(String s) {
		AnalizadorPalabras ap = new AnalizadorPalabras(s);
		int resultado = ap.contarCaracteresRepetidos();
		System.out.println(resultado + " caracteres repetidos.");
	}
}
