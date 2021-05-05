package severo.ed.calidad.sonar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Random;

class Hola {
	
	private SecureRandom aleatorio = new SecureRandom();

	void noProvocaNPE() {
		Pointers.A a = Pointers.puedeDevolverNull(10);
		a.metodo();
	}
 
	void puedeProvocarNPE() {
		Pointers.A a = Pointers.puedeDevolverNull(aleatorio.nextInt());
		a.metodo();
	}

	private Random random() {
		return null;
	}

	void puedeFallarRecurso() throws IOException {
		OutputStream stream = Recursos.creaRecurso();
		if (stream == null) {
			return;
		}

		try {
			stream.write(12);
		} finally {
			stream.close();
		}
	}

	void dosRecursos() throws IOException {
		FileInputStream fis = null;
		try(OutputStream fos = new FileOutputStream(new File("quizas.txt"));) {
			fis = new FileInputStream(new File("algo.txt"));
			fos.write(fis.read());
		} finally {
			if (fis != null) {
				fis.close();
			}

		}
	}
}

