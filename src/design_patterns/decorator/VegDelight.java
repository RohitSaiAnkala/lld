package design_patterns.decorator;

public class VegDelight implements BasePizza {
    @Override
    public void preparePizza() {
        System.out.println("Veg Delight Pizza");
    }

    @Override
    public int cost() {
        return 100;
    }
}
