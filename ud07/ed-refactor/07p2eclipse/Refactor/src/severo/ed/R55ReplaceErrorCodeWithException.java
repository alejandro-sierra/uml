package severo.ed;

public class R55ReplaceErrorCodeWithException {

	private double balance;

	int sacarDinero(double cantidad) {
		if (cantidad > balance) {
			return -1;
		} else {
			balance -= cantidad;
			return 0;
		}
	}
	
}
