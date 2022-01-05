package StructuralPatterns.AdapterPattern.Example2;

public class CalculatorAdapter implements ICalculator {

    Calculator calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        calculator = new Calculator();

        Rectangle rectangle1 =  new Rectangle();
        rectangle1.length = triangle.base;
        rectangle1.width = 0.5 * triangle.height;

        return calculator.getArea(rectangle1);
    }
}
