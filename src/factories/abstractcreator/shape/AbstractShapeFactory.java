package factories.abstractcreator.shape;

public abstract class AbstractShapeFactory {
    protected abstract Shape factorShape();

    public Shape getShape() {
       return factorShape();
    }

}
