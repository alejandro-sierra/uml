package severo.ed;

public class R15ReplaceTempWithQuery {

	private int precioElemento;
	private int cantidad;

	double calculaTotal() {
		double precioBase = cantidad * precioElemento;
		if (precioBase > 1000) {
			return precioBase * 0.95;
		} else {
			return precioBase * 0.98;
		}
	}
}
