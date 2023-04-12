package factories.abstractcreator.shape;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factorShape() {
        return new Rectangle();
    }
}
