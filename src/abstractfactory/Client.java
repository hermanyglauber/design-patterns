package abstractfactory;

public class Client {

    public static void main (String args[]) {
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        shape.getShape("square").draw();
        shape.getShape("rectangle").draw();

        AbstractFactory color = FactoryProducer.getFactory("color");
        color.getColor("red").fill();
        color.getColor("green").fill();
        color.getColor("blue").fill();
    }

}
