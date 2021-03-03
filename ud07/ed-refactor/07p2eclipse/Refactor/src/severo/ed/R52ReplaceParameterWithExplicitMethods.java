package severo.ed;

public class R52ReplaceParameterWithExplicitMethods {
	
	private int altura;
	private int anchura;

	public void setValor(String nombre, int valor) {
		if (nombre.equals("altura")) {
			altura = valor;
			return;
		}
		if (nombre.equals("anchura")) {
			anchura = valor;
			return;
		}
	}
}
