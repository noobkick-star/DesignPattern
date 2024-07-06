package com.ankit.mycoolapp.strategyDesignPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("implementing normal drive strategy");
    }
}
