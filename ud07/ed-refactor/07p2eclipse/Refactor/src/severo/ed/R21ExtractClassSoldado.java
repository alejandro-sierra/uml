
package severo.ed;

public class R21ExtractClassSoldado {
	private int salud;
	private int danyoArma;
	private int estadoArma;

	public int getDanyoArma() {
		return danyoArma * estadoArma / 100;
	}

	public void atacar() {
		if (salud > 0) {
			
		}
		// ...
	}
}
