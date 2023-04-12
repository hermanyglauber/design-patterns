package factories.abstractcreator.vehicle;

public class CarFactory extends AbstractVehicleFactory{
    @Override
    protected Vehicle factoryVehicle() {
        return new Car();
    }
}
