package factories.abstractcreator.shape;

import model.shape.Shape;

public abstract class AbstractShapeFactory {
    protected abstract Shape factorShape();

    public Shape getShape() {
       return factorShape();
    }

}
