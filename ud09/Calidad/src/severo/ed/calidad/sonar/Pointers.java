package severo.ed.calidad.sonar;

public class Pointers {
	public static class A {
		public void metodo() {
		}
	}

	public static A puedeDevolverNull(int i) {
		if (i > 0) {
			return new A();
		}
		return null;
	}
}
