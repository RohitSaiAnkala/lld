package design_patterns.decorator;

public class Mushroom extends ToppingDecorator {

    Mushroom(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public void preparePizza() {
        super.preparePizza();
        System.out.println("Mushroom Added");
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
