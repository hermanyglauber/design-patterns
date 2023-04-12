package factories.abstractcreator.vehicle;

public class VehicleIndustry {
    public static void main(String[] args) {
        Vehicle truck = new TruckFactory().getVehicle();
        truck.build();

        Vehicle car = new CarFactory().getVehicle();
        car.build();
    }
}
