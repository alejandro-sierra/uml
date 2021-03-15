    package severo.ed;

/**
 * 
 * @author Alejandro Ballesta Sierras
 */
    
/**
 * Creamos una vaiable par ano tener tantas condiciones con el mismo resultado.
 */
    
/*
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
*/
    
public class R42ConsolidateConditionalExpression {
	private int antiguedad;
	private int mesesDeBaja;
	private boolean esJornadaPartida;

       double disabilityAmount() {
		if (siNoEs()) {
			return 0;

		// Compute the disability amount.
		// ...
		
	}
        
	double siNoEs() {
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
}
