package severo.ed.codeconventions;

import java.util.List;

public class ProductB extends Product {

    public static String InputMatch = "B";

    public ProductB() {super(50);}
    public ProductB(List<Discount> discounts) {
        super(50, discounts);
    }
    public ProductB(Discount discount) {
        super(50);
        this.adddiscount(discount);
    }

    public ProductB(int newCost) {
        super(newCost);
    }
}
