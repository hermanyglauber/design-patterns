package model.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void getArea(int dimA, int dimB) {
        System.out.println("Area of a rectangle: " + dimA * dimB);
    }
}
