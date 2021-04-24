package severo.ed.calidad.patrones;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogFactory {

	// Patrónn Factory Method
	public static Logger getLogger(String nombreClase) {
		// Eliminamos la configuración del log raíz
		Logger rootLogger = Logger.getLogger("");
		Handler[] handlers = rootLogger.getHandlers();
		if (handlers[0] instanceof ConsoleHandler) {
			rootLogger.removeHandler(handlers[0]);
		}
		
		// Creamos el nuevo Logger con todos los niveles para consola y fichero
		Logger result = Logger.getLogger(nombreClase);
		
		Handler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.ALL);

		Handler fileTxt = null;
		try {
			fileTxt = new FileHandler("logging.txt");
			
			SimpleFormatter simpleFormatter = new SimpleFormatter();
			fileTxt.setFormatter(simpleFormatter);
			fileTxt.setLevel(Level.INFO);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}

		result.addHandler(consoleHandler);
		result.addHandler(fileTxt);
		result.setLevel(Level.FINE);
		
		return result;
	}

}
