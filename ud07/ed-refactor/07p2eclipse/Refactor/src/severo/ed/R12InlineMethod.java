package severo.ed;

public class R12InlineMethod {

	public int cantidadEntregas;

	int getRating() {
		return masDe5Entregas() ? 2 : 1;
	}

	boolean masDe5Entregas() {
		return cantidadEntregas > 5;
	}

}
