package com.ankit.mycoolapp;

import com.ankit.mycoolapp.observerDesignPattern.observable.IphoneObservableImpl;
import com.ankit.mycoolapp.observerDesignPattern.observable.StockObservable;
import com.ankit.mycoolapp.observerDesignPattern.observer.EmailAlertNotification;
import com.ankit.mycoolapp.observerDesignPattern.observer.MobileAlertNotification;
import com.ankit.mycoolapp.observerDesignPattern.observer.NotificationAlertObserver;
import com.ankit.mycoolapp.strategyDesignPattern.strategy.model.NormalCar;
import com.ankit.mycoolapp.strategyDesignPattern.strategy.model.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
      Vehicle sportsCar = new NormalCar();
	  sportsCar.drive();

       StockObservable stockObservable = new IphoneObservableImpl();
		NotificationAlertObserver observer1 = new EmailAlertNotification(stockObservable,"observer1.gmail.com");
		NotificationAlertObserver observer2 = new EmailAlertNotification(stockObservable,"observer2.gmail.com");
		NotificationAlertObserver observer3 = new MobileAlertNotification("mobileUser" , stockObservable);
		stockObservable.add(observer1);
		stockObservable.add(observer2);
		stockObservable.add(observer3);
		stockObservable.remove(observer2);
		stockObservable.setStockCount(5);


	}

}
