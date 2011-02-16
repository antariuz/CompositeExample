package model.impl;

import model.Vehicle;

public class Bicycle implements Vehicle {
    @Override
    public String getVehicleType() {
        return "Bicycle";
    }
}
