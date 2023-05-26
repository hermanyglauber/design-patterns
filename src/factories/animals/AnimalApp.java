package factories.animals;

public class AnimalApp {
    public static void main(String[] args) {
        Animal dog = new AnimalFactory().getAnimal("dog");
        dog.walk();
        Animal duck = new AnimalFactory().getAnimal("duck");
        duck.walk();
    }
}
