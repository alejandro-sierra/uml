package EDE07p2vuelo;
/**
 * @author Alejandro Ballesta Sierras
 */
public class MemberOfPassenger extends Passenger {

    private int Yearsofmembership = 0;

    public void MembMemberOfPassengerer(int yom, int a, String n) {
        super.getClass();
        Yearsofmembership = yom;
    }

    public double applyDiscount(int p) {
        if (Yearsofmembership > 5) {
            p = p / 2;
            return p;
        } else if (Yearsofmembership <= 5 && Yearsofmembership > 1) {
            p = (p * 9) / 10;
            return p;
        }
        return 0;

    }
    @Override
     public double applyDiscount(double p) {
         return 0.0;
     }
}
