package CreationalPatterns.FactoryPattern.Example2;

import CreationalPatterns.FactoryPattern.contracts.Shape;

public class Client {

    public static void main(String[] args){

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

    }
}
