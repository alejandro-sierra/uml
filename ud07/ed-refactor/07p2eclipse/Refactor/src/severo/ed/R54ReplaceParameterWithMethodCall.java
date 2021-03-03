package severo.ed;

public class R54ReplaceParameterWithMethodCall {

	private double precioItem;
	private int quantity;

	public double calculaPrecio() {
		double precioBase = quantity * precioItem;
		double descuento = this.getDescuento();
		double tasas = this.getTasas();
		double precioFinal = calculaPrecioDescontado(precioBase, descuento, tasas);

		return precioFinal;
	}

	private double calculaPrecioDescontado(double basePrice, double seasonDiscount, double fees) {
		// TODO Auto-generated method stub
		return 0;
	}

	private double getTasas() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double getDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}
}
