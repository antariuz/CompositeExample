package composite;

import model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Vehicle {
    private final List<Vehicle> components = new ArrayList<>();

    @Override
    public void getVehicleType() {
        for(Vehicle component: components){
            component.getVehicleType();
        }
    }

    public void addComponent(Vehicle vehicle){
        components.add(vehicle);
    }

    public void removeComponent(Vehicle vehicle){
        components.remove(vehicle);
    }

}
