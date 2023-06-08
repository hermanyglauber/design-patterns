package abstractfactory;

import model.color.Color;
import model.shape.Shape;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
