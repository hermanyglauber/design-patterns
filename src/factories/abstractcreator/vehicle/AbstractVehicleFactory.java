package factories.abstractcreator.vehicle;

public abstract class AbstractVehicleFactory {

    protected abstract Vehicle factoryVehicle();

    protected Vehicle getVehicle() {
        return factoryVehicle();
    }
}
