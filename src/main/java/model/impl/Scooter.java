package model.impl;

import model.Vehicle;

public class Scooter implements Vehicle {
    @Override
    public void getVehicleType() {
        System.out.println("Scooter");
    }
}
