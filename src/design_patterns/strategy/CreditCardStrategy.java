package design_patterns.strategy;

public class CreditCardStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Paid amount:"+amount+" using credit card");
    }
}
