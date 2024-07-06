package com.ankit.mycoolapp;

import com.ankit.mycoolapp.strategy.SportsDriveStrategy;

public class SportsCar extends Vehicle{
    public SportsCar(){
        super(new SportsDriveStrategy());
    }
}
