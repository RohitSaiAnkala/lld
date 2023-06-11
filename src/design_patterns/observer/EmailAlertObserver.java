package design_patterns.observer;

public class EmailAlertObserver implements NotificationAlertObserver {
    String emailId;
    StockObservable stockObservable;

    EmailAlertObserver(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        int data = stockObservable.getData();
        System.out.println("mail sent to:" + emailId);
    }
}
