package model.shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public void getArea(int dimA, int dimB) {
        System.out.println("Area of a square: " + dimA * dimB);
    }
}
