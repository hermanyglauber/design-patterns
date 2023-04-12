package factories.abstractcreator.shape;

public class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Shape factorShape() {
        return new Square();
    }
}
