package com.ankit.mycoolapp;

import com.ankit.mycoolapp.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driverObj ;
    public Vehicle( DriveStrategy driverObj){
        this.driverObj = driverObj ;
    }
     public void drive(){
        driverObj.drive();
     }
}
