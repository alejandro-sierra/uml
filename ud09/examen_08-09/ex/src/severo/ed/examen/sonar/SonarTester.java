package severo.ed.examen.sonar;

public class SonarTester {

	public static void main(String[] args) {
		SonarTester e = new SonarTester();
		
		System.out.println(e.imprimeDia(new Integer((int) (Math.random() * 7))));
		
		Punto puntito = new Punto();
		puntito.setX(3);
		puntito.setY(4);
		System.out.println("Coordenadas (3,4) - (" + puntito.getX() + "," + puntito.getY() + ")");

		Object o = haceAlgo();
		imprimeAlgo(o);
	}

	public String imprimeDia(int numDiaSemana) {
		String nombreDia;
		switch (numDiaSemana) {
		default:
			nombreDia = "Día invalido";
		case 1:
			nombreDia = "Lunes";
			break;
		case 2:
			nombreDia = "Martes";
			break;
		case 3:
			nombreDia = "Miércoles";
		case 4:
			nombreDia = "Jueves";
			break;
		case 5:
			nombreDia = "Viernes";
			break;
		case 6:
			nombreDia = "Sábado";
			break;
		case 7:
			nombreDia = "Domingo";
			break;
		}
		return nombreDia;
	}

	private static Object haceAlgo() {
		Object o = new Object();
		System.out.println(o);
		return null;
	}

	private static void imprimeAlgo(Object o) {
		System.out.println(o.toString());
	}

}
