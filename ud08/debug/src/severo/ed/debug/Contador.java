package severo.ed.debug;

public class Contador {
	private int resultado;
		
	public Contador() {
		this.resultado = 0;
	}

	public int getResultado() {
		return resultado;
	}

	public void contar() {
		for (int i = 0; i < 100; i++) {
			resultado += i + 1;
		}
	}
	
	public void triContarDesde0() {
		resultado = 0;
		this.contar();
		this.contar();
		this.contar();
		
		if (resultado %2 == 0) {
			// Forzamos una excepción de tipo ArithmeticException
			resultado = resultado / (resultado - resultado);
		}
	}
}
