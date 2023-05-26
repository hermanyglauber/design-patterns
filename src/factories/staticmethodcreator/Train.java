package factories.staticmethodcreator;

public class Train implements Toy {
    @Override
    public void repair() {
        System.out.println("Repair a TRAIN");
    }
}
