package design_patterns.strategy;

public class DebitCardStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid amount:"+amount+" using debit card");
    }
}
