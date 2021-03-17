package severo.ed.refactor;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        final int FILTER_COFFEE = 0, ESPRESSO = 1, CAPPUCCINO = 2;

        // create a Map of available coffee beans
        Map<Integer, GranoCafe> beans = new HashMap<>();
        beans.put(ESPRESSO, new GranoCafe(
                "My favorite espresso bean", 1000));
        beans.put(FILTER_COFFEE, new GranoCafe(
                "My favorite filter coffee bean", 1000));
        beans.put(CAPPUCCINO, new GranoCafe(
                "My favorite cappuccino coffee", 1000));

        // get a new CoffeeMachine object
        BasicCoffeeMachine machine = new BasicCoffeeMachine(beans);

        // brew a fresh coffee
        try {
            Coffee espresso = machine.prepararCafe(ESPRESSO);
            System.out.println("Coffee is ready!");
        } catch (CoffeeException e) {
            e.printStackTrace();
        }
    } // end main
}
