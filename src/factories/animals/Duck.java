package factories.animals;

public class Duck implements Animal {
    @Override
    public void walk() {
        System.out.println("This is duck walking");
    }
}
