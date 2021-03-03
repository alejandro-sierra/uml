package severo.ed;

public class R13ExtractVariable {

	void renderBanner(String platforma, String browser, int resize) {
		if ((platforma.toUpperCase().indexOf("MAC") > -1) && (browser.toUpperCase().indexOf("IE") > -1)
				&& estabaInicializada() && resize > 0) {
			// do something
		}
	}

	private boolean estabaInicializada() {
		// TODO Auto-generated method stub
		return false;
	}

}
