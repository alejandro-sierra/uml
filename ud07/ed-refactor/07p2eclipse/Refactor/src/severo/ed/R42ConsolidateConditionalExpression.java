package severo.ed;

public class R42ConsolidateConditionalExpression {
	private int antiguedad;
	private int mesesDeBaja;
	private boolean esJornadaPartida;

	double disabilityAmount() {
		if (antiguedad < 2) {
			return 0;
		}
		if (mesesDeBaja > 12) {
			return 0;
		}
		if (esJornadaPartida) {
			return 0;
		}
		// Compute the disability amount.
		// ...
		
		return 0.0;
	}
}
