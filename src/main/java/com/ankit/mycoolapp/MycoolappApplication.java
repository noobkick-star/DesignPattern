package com.ankit.mycoolapp;

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
	}

}
