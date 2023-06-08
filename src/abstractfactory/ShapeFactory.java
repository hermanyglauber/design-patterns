package abstractfactory;

import model.color.Color;
import model.shape.Rectangle;
import model.shape.Shape;
import model.shape.Square;

public class ShapeFactory extends AbstractFactory {

    // this is a code smell, not following good programming design, only used like this to simplify the AbstractFactory pattern
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        if(shape.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
