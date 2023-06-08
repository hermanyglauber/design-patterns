package factories.abstractcreator.shape;

import model.shape.Rectangle;
import model.shape.Shape;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factorShape() {
        return new Rectangle();
    }
}
