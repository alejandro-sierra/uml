package severo.ed;

import java.util.Date;

public class R22IntroduceForeignMethod {
	private Date fechaInforme;

	void sendReport() {
		Date sigDia = new Date(fechaInforme.getYear(), fechaInforme.getMonth(), fechaInforme.getDate() + 1);
		// ...

	}
}
