package severo.ed;

public class R45ReplaceNestedConditional {

	private boolean estaMuerto;
	private boolean estaSeparado;
	private boolean estaRetirado;

	public double getCantidadPago() {
		double resultado;
		if (estaMuerto) {
			resultado = cantidadMuerto();
		} else {
			if (estaSeparado) {
				resultado = cantidadSeparado();
			} else {
				if (estaRetirado) {
					resultado = cantidadJubilado();
				} else {
					resultado = cantidadNormal();
				}
			}
		}
		return resultado;
	}

	private double cantidadNormal() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double cantidadJubilado() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double cantidadSeparado() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double cantidadMuerto() {
		// TODO Auto-generated method stub
		return 0;
	}
}
