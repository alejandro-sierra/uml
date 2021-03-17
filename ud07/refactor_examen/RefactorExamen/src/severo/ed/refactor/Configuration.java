package severo.ed.refactor;

public class Configuration {

    private double quantityCoffee;
    private double quantityWater;

	public void quantity(double quantityCoffee, double quantityWater) {
        extracted(quantityCoffee, quantityWater);
    }

	private void extracted(double quantityCoffee, double quantityWater) {
		this.quantityCoffee = quantityCoffee;
        this.quantityWater = quantityWater;
	}

    public double getQuantityCoffee() {
        return quantityCoffee;
    }

    public double getQuantityWater() {
        return quantityWater;
    }

}
