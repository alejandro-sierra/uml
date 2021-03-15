package severo.ed;

/**
 * 
 * @author Alejandro Ballesta Sierras
 */

/**
 * Sustituyo una matriz de arrays por unos obejtos.
 */

/*
public class R32ReplaceArrayWithObject {
	
	public void trabajandoConArrays() {
String[] row = new String[2];
row[0] = "Liverpool";
row[1] = "15";
	}

}
*/

public class R32ReplaceArrayWithObject {
	private String name;
        private String win;
        
	public void trabajandoConArrays() {
            String s1 = new String();
		s1.setName("Liverpool");
		s1.setWin("15");
	}
//getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }


}
