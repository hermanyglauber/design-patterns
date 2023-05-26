package factories.concretecreator.furniture;

public class Chair implements Furniture {
    @Override
    public void paint() {
        System.out.println("painting a Chair");
    }
}
