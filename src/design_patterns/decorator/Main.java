package design_patterns.decorator;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new MargaritaPizza();
        basePizza.preparePizza();
        System.out.println("Cost:" + basePizza.cost());
        System.out.println("-------------------");
        BasePizza margaritaPizzaWithExtraCheese = new ExtraCheese(new MargaritaPizza());
        margaritaPizzaWithExtraCheese.preparePizza();
        System.out.println("Cost:" + margaritaPizzaWithExtraCheese.cost());
        System.out.println("--------------------");
        BasePizza vegDelightWithExtraCheeseAndMushrooms = new Mushroom(new ExtraCheese(new VegDelight()));
        vegDelightWithExtraCheeseAndMushrooms.preparePizza();
        System.out.println("Cost:" + vegDelightWithExtraCheeseAndMushrooms.cost());
    }
}
