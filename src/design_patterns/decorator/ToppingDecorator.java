package design_patterns.decorator;

public class ToppingDecorator implements BasePizza {
    BasePizza basePizza;

    ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public void preparePizza() {
        this.basePizza.preparePizza();
    }

    @Override
    public int cost() {
        return this.basePizza.cost();
    }
}
