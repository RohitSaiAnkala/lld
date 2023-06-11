package design_patterns.observer;

public class MobileAlertObserver implements NotificationAlertObserver {
    String userId;
    StockObservable stockObservable;

    MobileAlertObserver(String userId, StockObservable stockObservable) {
        this.userId = userId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        int data = stockObservable.getData();
        System.out.println("msg sent to:" + userId );
    }
}
