package severo.ed;

public class R17RemoveAssignmentsToParameters {
	
	int descuento(int valorEntrada, int cantidad) {
		if (cantidad > 50) {
			valorEntrada -= 2;
		}
		// ...

		return valorEntrada * cantidad;
	}
}
