package severo.ed.refactor;

public class UnidadPreparacion {

    public Coffee elaborar(int selection, CafeMolido cafeMolido,
                           double quantity) {
        return new Coffee(selection, quantity);
    }
}
