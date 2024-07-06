package com.ankit.mycoolapp.strategyDesignPattern.strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("implementing sports drive strategy");
    }
}
