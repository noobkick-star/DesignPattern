package com.ankit.mycoolapp.strategyDesignPattern.strategy.model;

import com.ankit.mycoolapp.strategyDesignPattern.strategy.SportsDriveStrategy;

public class SportsCar extends Vehicle{
    public SportsCar(){
        super(new SportsDriveStrategy());
    }
}
