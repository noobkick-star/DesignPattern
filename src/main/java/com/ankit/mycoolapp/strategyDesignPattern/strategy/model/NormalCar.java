package com.ankit.mycoolapp.strategyDesignPattern.strategy.model;

import com.ankit.mycoolapp.strategyDesignPattern.strategy.NormalDriveStrategy;

public class NormalCar extends Vehicle{

    public NormalCar() {
        super(new NormalDriveStrategy());
    }
}
