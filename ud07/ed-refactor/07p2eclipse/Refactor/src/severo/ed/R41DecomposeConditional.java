package severo.ed;

import java.util.Date;

public class R41DecomposeConditional {

	private static final Date SUMMER_START = null;
	private static final Date SUMMER_END = null;
	private int quantity;
	private int winterRate;
	private int summerRate;
	private int winterServiceCharge;

	public double condicion(Date date) {
		double charge;
		if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
			charge = quantity * winterRate + winterServiceCharge;
		} else {
			charge = quantity * summerRate;
		}
		return charge;
	}
	
}