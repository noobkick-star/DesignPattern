package com.ankit.mycoolapp.strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("implementing normal drive strategy");
    }
}
