package app;

public class Calculadora {
	private double memoria;

	public double suma(double a, double b) {
		this.memoria = a + b;
		return this.memoria;
	}

	public double resta(double a, double b) {
		this.memoria = a - b;
		return this.memoria;
	}

	public double multiplicacion(double a, double b) {
		this.memoria = a * b;
		return this.memoria;
	}

	public double division(double a, double b) {
		this.memoria = a / b;
		return this.memoria;
	}

	public double absoluto(double a) {
		if (a < 0) {
			return -a;
		} else {
			return a;
		}
	}

	public boolean esPar(int a) {
		return a % 2 == 0;
	}

	public void inicializaMemoria() {
		this.memoria = 0;
	}

	public double getMemoria() {
		return this.memoria;
	}
}
