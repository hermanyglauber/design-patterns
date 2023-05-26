package factories.animals;

public class Dog implements Animal {

    @Override
    public void walk() {
        System.out.println("This is a dog walking");
    }
}
