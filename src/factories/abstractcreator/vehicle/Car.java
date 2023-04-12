package factories.abstractcreator.vehicle;

public class Car implements Vehicle{
    @Override
    public void build() {
        System.out.println("Let's build a CAR");
    }
}
