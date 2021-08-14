import composite.Composite;
import model.Vehicle;
import model.impl.Bicycle;
import model.impl.Quadricycle;
import model.impl.Scooter;

public class CompositeExample {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Bicycle();
        Vehicle vehicle2 = new Quadricycle();
        Vehicle vehicle3 = new Scooter();

        Vehicle vehicle4 = new Scooter();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addComponent(vehicle1);
        composite1.addComponent(vehicle2);
        composite1.addComponent(vehicle3);
        composite2.addComponent(vehicle4);
        composite.addComponent(composite1);
        composite.addComponent(composite2);

        composite.getVehicleType();

    }
}
