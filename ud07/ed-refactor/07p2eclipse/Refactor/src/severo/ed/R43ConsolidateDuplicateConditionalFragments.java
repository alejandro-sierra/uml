package severo.ed;

public class R43ConsolidateDuplicateConditionalFragments {

	public double condicionalFragmentoDuplicado(double precio) {
		double total;
		if (isSpecialDeal()) {
			total = precio * 0.95;
			send();
		} else {
			total = precio * 0.98;
			send();
		}
		return total;
	}

	private boolean isSpecialDeal() {
		// TODO Auto-generated method stub
		return false;
	}

	private void send() {
		// TODO Auto-generated method stub
		
	}

}
