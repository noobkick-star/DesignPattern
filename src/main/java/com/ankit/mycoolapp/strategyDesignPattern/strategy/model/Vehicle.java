package com.ankit.mycoolapp.strategyDesignPattern.strategy.model;

import com.ankit.mycoolapp.strategyDesignPattern.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driverObj ;
    public Vehicle( DriveStrategy driverObj){
        this.driverObj = driverObj ;
    }
     public void drive(){
        driverObj.drive();
     }
}
