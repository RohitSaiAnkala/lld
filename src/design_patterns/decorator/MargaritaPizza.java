package design_patterns.decorator;

public class MargaritaPizza implements BasePizza {

    @Override
    public void preparePizza() {
        System.out.println("Margarita Pizza");
    }

    @Override
    public int cost() {
        return 200;
    }
}
