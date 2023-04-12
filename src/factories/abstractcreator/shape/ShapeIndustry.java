package factories.abstractcreator.shape;

public class ShapeIndustry {
    public static void main(String[] args) {
        Shape square = new SquareFactory().getShape();
        square.draw();
        square.getArea(2, 2);

        Shape rectangle = new RectangleFactory().getShape();
        rectangle.draw();
        rectangle.getArea(3, 2);

    }
}
