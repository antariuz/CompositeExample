package composite;

import model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Vehicle {
    private final List<Vehicle> components = new ArrayList<>();

    @Override
    public String getVehicleType() {
        for(Vehicle component: components){
            System.out.println(component.getVehicleType());
        }
        return null;
    }

    public void addComponent(Vehicle vehicle){
        components.add(vehicle);
    }

    public void removeComponent(Vehicle vehicle){
        components.remove(vehicle);
    }

}
