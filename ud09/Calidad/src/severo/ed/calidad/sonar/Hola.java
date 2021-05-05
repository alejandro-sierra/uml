package severo.ed.calidad.sonar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

class Hola {

	void noProvocaNPE() {
		Pointers.A a = Pointers.puedeDevolverNull(10);
		a.metodo();
	}

	private Random rand = random();  
	void puedeProvocarNPE() {
		var aleatorio = new Random();
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
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(new File("algo.txt"));
			fos = new FileOutputStream(new File("quizas.txt"));
			fos.write(fis.read());
		} finally {
			if (fis != null) {
				fis.close();
			}
			if (fos != null) {
				fos.close();
			}else {
				fos.close();
			}
		}
	}
}
