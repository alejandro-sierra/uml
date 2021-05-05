package severo.ed.calidad.sonar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Recursos {
	public static FileOutputStream creaRecurso() {
		try {
			var file = new File("foo.txt");
			return new FileOutputStream(file);
		} catch (IOException e) {
			return null;
		}
	}
}
