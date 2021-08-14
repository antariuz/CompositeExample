package model.impl;

import model.Vehicle;

public class Bicycle implements Vehicle {
    @Override
    public void getVehicleType() {
        System.out.println("Bicycle");
    }
}
