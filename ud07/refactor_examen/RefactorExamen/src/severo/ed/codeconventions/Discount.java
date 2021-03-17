package severo.ed.codeconventions;

public abstract class Discount {
    int _discount=0;

    
    public Discount(int d) {this._discount=d;}
    abstract int apply(int numberOfProducts, int price);
    enum typesDiscount{ one, _two, three, Four};
}
