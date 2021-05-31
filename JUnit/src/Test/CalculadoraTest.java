package Test;

import org.junit.jupiter.api.*;

import app.Calculadora;

class CalculadoraTest {
	
	private static Calculadora calculadora;
	
	@BeforeAll
	static void inicializar() {
		calculadora = new Calculadora();
	}

	@Test
	void testSuma() {
		Assertions.assertEquals(5, calculadora.suma(2, 3),"Probando la suma");
	}

	@Test
	void testSumaNegativo() {
		Assertions.assertEquals(-8, calculadora.suma(2, -10));
	}
	
	@Test
	void testResta() {
		Assertions.assertEquals(1, calculadora.resta(3, 2), "Probando la resta");
	}
	
	@Test
	void testMultiplicacion() {
		Assertions.assertEquals(6, calculadora.multiplicacion(3, 2));
	}
	
	@Test
	void testDivision() {
		Assertions.assertEquals(1, calculadora.division(3, 3));
	}
	
	@Test
	void testAdsoluto() {
		Assertions.assertEquals(3, calculadora.absoluto(-3), "Probando el adsoluto");
	}
	
	@Test
	void testEsPar() {
		Assertions.assertEquals(false, calculadora.esPar(3));
	}
}
