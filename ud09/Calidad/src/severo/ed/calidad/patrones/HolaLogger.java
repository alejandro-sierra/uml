package severo.ed.calidad.patrones;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HolaLogger {

	private static final Logger LOGGER = LogFactory.getLogger(HolaLogger.class.getName());

	public static void main(String[] args) {
		HolaLogger ejemplo = new HolaLogger();
		ejemplo.escribirEnLog();
	}

	public void escribirEnLog() {
		LOGGER.config("Mensaje de configuraciónn");
		LOGGER.fine("Depurando el programa");
		LOGGER.warning("Se ha lanzado una excepción");
		LOGGER.severe("No se ha podido conectar con la Base de Datos");
		LOGGER.log(Level.FINEST, "Depuraciónn más fina");
		LOGGER.log(Level.INFO, "El log se ha probado correctamente");
	}
}
