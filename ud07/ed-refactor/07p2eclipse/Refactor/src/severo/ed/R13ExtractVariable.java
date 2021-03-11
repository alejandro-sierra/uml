package severo.ed;

/**
 * @author Alejandro Ballesta Sierras
 */

/**
 *Tenemos una expresion dificil de expresar, por lo que lo separamos en 
 * variables diferentes y hacemos un if con todas.
 */

/*
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

*/

public class R13ExtractVariable {

    void renderBanner(String platforma, String browser, int resize) {
        boolean os = platforma.toUpperCase().indexOf("MAC") > -1;
        boolean nav = browser.toUpperCase().indexOf("IE") > -1;
	boolean estabaInicializada = false;
        boolean camb = resize > 0 ;
                                        
        if (os && nav && estabaInicializada() && resize) { 
        //no se arreglar el error, creo que esta bien y no consigo que se quite el error
            // do something
        }
    }

    private boolean estabaInicializada(boolean a) {
        // TODO Auto-generated method stub
        return false;
    }

}
