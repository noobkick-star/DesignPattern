package com.ankit.mycoolapp.observerDesignPattern.observer;

import com.ankit.mycoolapp.observerDesignPattern.observable.StockObservable;

public class EmailAlertNotification implements NotificationAlertObserver{
    StockObservable stockObservable;
     String email;

    public EmailAlertNotification(StockObservable stockObservable, String email) {
        this.stockObservable = stockObservable;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("sending notification via email to "+this.email);
    }
}
