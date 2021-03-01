
public class MemberOfPassenger inherits Passenger {

            private int Yearsofmembership = 0;

            public MembMemberOfPassengerer(int yom, int a, String n) {

                super(a, n);
                Yearsofmembership = yom;


            }

            @Overwrite
            public double applyDiscount(String p) {
                if (Yearsofmembership > 5) {
                    p = p / 2;
                    return p;
                } else if (Yearsofmembership <= 5 && Yearsofmembership > 1) {
                    p = (p *9)/10;
                    return p;
                }

            }

}
