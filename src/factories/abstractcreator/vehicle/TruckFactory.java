package factories.abstractcreator.vehicle;

public class TruckFactory extends AbstractVehicleFactory{
    @Override
    protected Vehicle factoryVehicle() {
        return new Truck();
    }
}
