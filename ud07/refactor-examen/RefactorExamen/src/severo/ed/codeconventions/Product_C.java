package severo.ed.codeconventions;

public class Product_C extends Product {
    public static String inputmatch = "C";

    private Product_C() {
        super(30);
    }

    public Product_C(int newCost) {
        super(newCost);
    }

    public Product_C(Discount discount) {
        super(50);
        this.adddiscount(discount);
    }
}