package severo.ed.refactor;

public class Coffee {

    private int coffeeSelection;

    private double quantity;

    public Coffee (int coffeeSelection, double quantity) {
        this.coffeeSelection = coffeeSelection;
        this.quantity = quantity;
    }

    public int getSelection() {
        return coffeeSelection;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) throws CoffeeException {
        if (quantity >= 0.0) {
            this.quantity = quantity;
        } else {
            throw new CoffeeException("Quantity has to be >= 0.0.");
        }
    }
}
