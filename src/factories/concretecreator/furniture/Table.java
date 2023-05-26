package factories.concretecreator.furniture;

public class Table implements Furniture {
    @Override
    public void paint() {
        System.out.println("painting a TABLE");
    }
}
