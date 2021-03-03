package EDE07p2vuelo;
/**
 * @author Alejandro Ballesta Sierras
 */
public abstract class Passenger {
    private String name;
    private int age;

    public Passenger(int a, String n) {name = n;age = a;}

    public String getName(String name) {
        return name;
    }

    abstract public double applyDiscount(double p);
}
