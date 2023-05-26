package factories.concretecreator.furniture;

public class FurnitureIndustry {
    public static void main(String[] args) {
        Furniture table = new ConcreteFurnitureFactory().getFurniture("TABLE");
        table.paint();

        Furniture chair = new ConcreteFurnitureFactory().getFurniture("CHAIR");
        chair.paint();
    }

}
