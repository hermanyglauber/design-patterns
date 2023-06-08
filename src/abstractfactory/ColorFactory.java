package abstractfactory;

import model.color.Blue;
import model.color.Color;
import model.color.Green;
import model.color.Red;
import model.shape.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        if(color.equalsIgnoreCase("red")) {
            return new Red();
        }
        if(color.equalsIgnoreCase("blue")) {
            return new Blue();
        }
        if(color.equalsIgnoreCase("green")) {
            return new Green();
        }
        return null;
    }

    // this is a code smell, not following good programming design, only used like this to simplify the AbstractFactory pattern
    @Override
    Shape getShape(String shape) {
        return null;
    }
}
