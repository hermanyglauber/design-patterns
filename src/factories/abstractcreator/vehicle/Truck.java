package factories.abstractcreator.vehicle;

public class Truck implements Vehicle {
    @Override
    public void build() {
        System.out.println("Let's build a TRUCK");
    }
}
