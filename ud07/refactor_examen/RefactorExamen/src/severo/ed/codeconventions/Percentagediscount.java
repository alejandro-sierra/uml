package severo.ed.codeconventions;

public class Percentagediscount extends Discount {
    private int percent;

    public Percentagediscount(int percent) {
        super(percent);
    }

    public int apply(int numberOfProducts, int price) {
        if(numberOfProducts >0){
            return numberOfProducts * price * percent / 100;
        } else if(numberOfProducts == 0)
            return 0;
		return price;
    }
}
