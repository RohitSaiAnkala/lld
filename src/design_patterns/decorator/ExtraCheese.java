package design_patterns.decorator;

public class ExtraCheese extends ToppingDecorator {

    ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public void preparePizza() {
        super.preparePizza();
        System.out.println("Extra Cheese Added");
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
