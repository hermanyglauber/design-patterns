package factories.animals;

import model.animal.Animal;
import model.animal.Dog;
import model.animal.Duck;

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
