package severo.ed.calidad.doc;

/**
 * Clase que define una persona con sus datos de contacto
 * @author Aitor Medrano - medrano_ait@gva.es
 * @version 1.0
 */
public class Persona {
	
	/**
	 * Identificador del usuario. Se obtiene de la BBDD
	 */
	private long id;
	private String nombre;
	private String apellidos;
	
	private String telefono;
	private String email;
	
	/**
	 * Constructor con datos basicos
	 * @param id identificador del usuario
	 * @param nombre nombre de la persona
	 * @param apellidos apellidos de la persona
	 */
	public Persona(long id, String nombre, String apellidos) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	/**
	 * Recupera el nombre de la persona
	 * @return Nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Le asigna el nombre a la persona
	 * @param nombre Nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Elimina una persona de la base de datos
	 * @param id identificador de la persona a eliminar
	 * @throws PersonaNoExisteException No se ha encontrado la persona a eliminar
	 */
	public void eliminarPersona(long id) throws PersonaNoExisteException {
		if (id < 0) {
			throw new PersonaNoExisteException();
		} else {
			// vamos a la BBDD y eliminamos el usuario
		}
		
	}
	
	
	
}
