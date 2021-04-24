package severo.ed.calidad.sonar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Recursos {
	public static FileOutputStream creaRecurso() {
		try {
			File file = new File("foo.txt");
			return new FileOutputStream(file);
		} catch (IOException e) {
			return null;
		}
	}
}
