package severo.ed.refactor;

import java.util.HashMap;
import java.util.Map;

public class BasicCoffeeMachine {

    public static final int LIMIT_QUANTITY_GRANOS_CAFE = 100;

    //TODO Refactorizar!!
    private static final int FILTER_COFFEE = 0, ESPRESSO = 1, CAPPUCCINO = 2;

    protected Map configMap;
    protected Map granos;
    protected Molinillo molinillo;
    protected UnidadPreparacion unidadPreparacion;

    public BasicCoffeeMachine(Map granos) {
        this.granos = granos;
        this.molinillo = new Molinillo();
        this.unidadPreparacion = new UnidadPreparacion();

        this.configMap = new HashMap();
        this.configMap.put(FILTER_COFFEE, new Configuration(30, 480));
    }

    //TODO Refactorizar
    public Coffee prepararCafe(int coffeeSelection) throws CoffeeException {
        switch (coffeeSelection) {
            case FILTER_COFFEE:
                return prepararCafeFiltrado();
            default:
                throw new CoffeeException("CoffeeSelection [" + coffeeSelection + "] not supported!");
        }
    }

    //TODO Refactorizar
    private Coffee prepararCafeFiltrado() {
        Configuration config = (Configuration) configMap.get(FILTER_COFFEE);

        // muele los granos de cafe
        CafeMolido cafeMolido = this.molinillo.grind(
                (GranoCafe) this.granos.get(FILTER_COFFEE), config.getQuantityCoffee());

        // prepara cafe filtrado
        return this.unidadPreparacion.elaborar(
                FILTER_COFFEE, cafeMolido, config.getQuantityWater());
    }

    //TODO Refactorizar!!
    public final void addGranosCafe(int coffeeSelection, GranoCafe nuevoGranoCafe)
            throws CoffeeException {
        GranoCafe tieneGranosCafe = (GranoCafe) this.granos.get(coffeeSelection);

        if (tieneGranosCafe != null) {
            if (tieneGranosCafe.getName().equals(nuevoGranoCafe.getName()) && tieneGranosCafe.getQuantity() < LIMIT_QUANTITY_GRANOS_CAFE) {
                tieneGranosCafe.setQuantity(tieneGranosCafe.getQuantity() + nuevoGranoCafe.getQuantity());
            } else {
                throw new CoffeeException(
                        "Only one kind of beans supported for each CoffeeSelection.");
            }
        } else {
            this.granos.put(coffeeSelection, nuevoGranoCafe);
        }
    }

    //TODO Refactorizar
    public void mostrarGranosDeCafe() {
        System.out.println("Cafe filtrado");
        GranoCafe granoCafe = (GranoCafe) this.granos.get(FILTER_COFFEE);
        System.out.println("Grano de café: " + granoCafe.getName());
        System.out.println("Cantidad: " + granoCafe.getQuantity());

        mostrarGranosEspresso();
        mostrarGranosCappuccino();
    }

    private void mostrarGranosEspresso() {
        System.out.println("Cafe espresso");
        GranoCafe granoCafe = (GranoCafe) this.granos.get(ESPRESSO);
        System.out.println("Grano de café: " + granoCafe.getName());
        System.out.println("Cantidad: " + granoCafe.getQuantity());
    }

    private void mostrarGranosCappuccino() {
        System.out.println("Cafe cappuccino");
        GranoCafe granoCafe = (GranoCafe) this.granos.get(CAPPUCCINO);
        System.out.println("Grano de café: " + granoCafe.getName());
        System.out.println("Cantidad: " + granoCafe.getQuantity());
    }

}

