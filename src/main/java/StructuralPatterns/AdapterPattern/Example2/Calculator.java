package StructuralPatterns.AdapterPattern.Example2;

public class Calculator implements ICalculator{
    // This class is the Adaptee

    private Rectangle rectangle;

    @Override
    public double getArea(Rectangle rectangle) {
        this.rectangle = rectangle;

        return this.rectangle.length * this.rectangle.width;
    }
}
