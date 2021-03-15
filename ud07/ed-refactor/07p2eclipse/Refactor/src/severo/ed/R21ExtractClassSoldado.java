
package severo.ed;

/**
 * 
 * @author Alejandro Ballesta Sierras
 */

/**
 * 
 */

/*

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

*/

public class R21ExtractClassSoldado {
    
    class Soldado {
        private int salud;
	private int danyoArma;
	private int estadoArma;
    
        public int DanyoArma(int danyoArma,int estadoArma) {
            return danyoArma * estadoArma / 100;
        }

	public void atacar(int salud) {
		if (salud > 0) {
			
		}
		// ...
	}
    }
        
        

}
