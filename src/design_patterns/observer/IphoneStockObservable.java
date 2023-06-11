package design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable {
    int stockCount = 0;
    List<NotificationAlertObserver> observerList;

    IphoneStockObservable() {
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyUser() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setData(int newStockCount) {
        if (stockCount == 0) {
            stockCount += newStockCount;
            notifyUser();
        } else
            stockCount += newStockCount;
    }

    @Override
    public int getData() {
        return stockCount;
    }

}
