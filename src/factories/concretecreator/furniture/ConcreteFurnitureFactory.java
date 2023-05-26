package factories.concretecreator.furniture;

public class ConcreteFurnitureFactory {

    public Furniture getFurniture(String furnitureType) {
        if (furnitureType == null) {
            return null;
        } else if (furnitureType.equalsIgnoreCase("CHAIR")) {
            return new Chair();
        } else if (furnitureType.equalsIgnoreCase("TABLE")) {
            return new Table();
        }
        return null;
    }

}
