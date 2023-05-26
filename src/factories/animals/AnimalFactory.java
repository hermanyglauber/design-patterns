package factories.animals;

public class AnimalFactory {

    public Animal getAnimal(String type) {
        if(type == null) {
            return null;
        }
        if(type.equalsIgnoreCase("duck")) {
            return new Duck();
        }
        if(type.equalsIgnoreCase("dog")) {
            return new Dog();
        }
        return null;
    }

}
