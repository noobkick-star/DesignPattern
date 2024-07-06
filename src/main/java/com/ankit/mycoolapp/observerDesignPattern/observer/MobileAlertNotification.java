package com.ankit.mycoolapp.observerDesignPattern.observer;

import com.ankit.mycoolapp.observerDesignPattern.observable.StockObservable;

public class MobileAlertNotification implements NotificationAlertObserver{
    String username;
    StockObservable stockObservable;

    public MobileAlertNotification(String username, StockObservable stockObservable) {
        this.username = username;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Sending notification via Mobile Notification to "+this.username);
    }
}
