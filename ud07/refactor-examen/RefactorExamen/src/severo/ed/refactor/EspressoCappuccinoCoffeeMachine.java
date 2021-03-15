package severo.ed.refactor;

import java.util.Map;

//TODO Refactorizar
public class EspressoCappuccinoCoffeeMachine extends BasicCoffeeMachine{

    private static final int FILTER_COFFEE = 0, ESPRESSO = 1, CAPPUCCINO = 2;

    public EspressoCappuccinoCoffeeMachine(Map granos) {
        super(granos);
        // add configuration to brew espresso
        this.configMap.put(ESPRESSO, new Configuration(8, 28));
        this.configMap.put(CAPPUCCINO, new Configuration(6, 22));
    }

    //TODO Refactorizar
    private Coffee prepararEspresso() {
        Configuration config = (Configuration) configMap.get(ESPRESSO);

        // grind the coffee beans
        CafeMolido groundCoffee = this.molinillo.grind(
                (GranoCafe) this.granos.get(ESPRESSO), config.getQuantityCoffee());

        // brew an espresso
        return this.unidadPreparacion.elaborar(
                ESPRESSO, groundCoffee, config.getQuantityWater());
    }

    //TODO Refactorizar
    private Coffee prepararCappuccino() {
        Configuration config = (Configuration) configMap.get(CAPPUCCINO);

        // grind the coffee beans
        CafeMolido groundCoffee = this.molinillo.grind(
                (GranoCafe) this.granos.get(CAPPUCCINO), config.getQuantityCoffee());

        // brew an espresso
        return this.unidadPreparacion.elaborar(
                CAPPUCCINO, groundCoffee, config.getQuantityWater());
    }

    //TODO Refactorizar
    public Coffee prepararCafe(int coffeeSelection) throws CoffeeException {
        if (coffeeSelection == ESPRESSO) {
            return prepararEspresso();
        } else if(coffeeSelection == CAPPUCCINO) {
            return prepararCappuccino();
        } else {
            return null;
        }
    }
}
