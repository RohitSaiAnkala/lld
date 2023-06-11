package design_patterns.observer;

public interface StockObservable {

    void addObserver(NotificationAlertObserver observer);

    void removeObserver(NotificationAlertObserver observer);

    void notifyUser();

    void setData(int data);

    int getData();
}
