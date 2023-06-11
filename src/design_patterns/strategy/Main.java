package design_patterns.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("123", 200));
        cart.addItem(new Item("456", 100));
        cart.pay(new CreditCardStrategy());

        cart = new ShoppingCart();
        cart.addItem(new Item("789", 300));
        cart.addItem(new Item("143", 100));
        cart.pay(new UPIStrategy());

    }
}
