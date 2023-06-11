package design_patterns.observer;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();
        NotificationAlertObserver observer1 = new EmailAlertObserver("abc@def.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("ghi@jkl.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("ankalar", iphoneStockObservable);
        iphoneStockObservable.addObserver(observer1);
        iphoneStockObservable.addObserver(observer2);
        iphoneStockObservable.addObserver(observer3);
        iphoneStockObservable.setData(10);
    }
}
