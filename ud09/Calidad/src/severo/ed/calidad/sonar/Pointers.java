package severo.ed.calidad.sonar;

public class Pointers {
	
	private Pointers() {}
	
	public static class A {
		public void metodo() {
			//comentario
			throw new UnsupportedOperationException();
		}
	}

	public static A puedeDevolverNull(int i) {
		if (i > 0) {
			return new A();
		}
		return null;
	}
}
