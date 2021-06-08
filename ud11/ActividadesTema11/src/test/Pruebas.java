package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Pruebas {

	private static double obtenerMedia(double[] numeros) {
		double suma = 0;
		for (double valor: numeros) {
		if (valor >= 20 && valor <=50) {
		suma += valor;
		}
		}
		return suma / numeros.length;
		}
	
	@Test
	static void TestMedia() {
		double [] numeros = {20,21,22};
		assertEquals(21.0, Pruebas.obtenerMedia(numeros),"Probando TestMedia");
	}
	
	private static int producto(int x, int y) {
		int z = 0; 
		while (x != 0) {
		if (x % 2 != 0) {
		z += y;
		}x /= 2;
		y *= 2;
		} return z;
		}
	
	@Test
	static void TestProducto() {
		assertEquals(15,Pruebas.producto(5, 3));
	}
	
	private static int mcd(int a, int b) {
		if (a < 0 || b < 0) {
		System.err.println("Los números deben ser positivos");
		return -1;
		} else if (a == 1 || b == 1) {
		return 1;
		} else {
		while (a != b) {
		if (a > b) {
		a -= b;
		} else {
		b -= a;
		}
		}
		return a;
		}
		}

	@Test
	static void MCD() {
		assertEquals(4,Pruebas.mcd(4, 8));
	}

}
