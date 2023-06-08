package factories.abstractcreator.shape;

import model.shape.Shape;
import model.shape.Square;

public class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Shape factorShape() {
        return new Square();
    }
}
