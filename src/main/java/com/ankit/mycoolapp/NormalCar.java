package com.ankit.mycoolapp;

import com.ankit.mycoolapp.strategy.DriveStrategy;
import com.ankit.mycoolapp.strategy.NormalDriveStrategy;

public class NormalCar extends Vehicle{

    public NormalCar() {
        super(new NormalDriveStrategy());
    }
}
