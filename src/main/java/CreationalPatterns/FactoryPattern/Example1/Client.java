package CreationalPatterns.FactoryPattern.Example1;

import CreationalPatterns.FactoryPattern.contracts.Shape;

public class Client {

    public static void main(String[] args){

        Shape shape1 =  new CircleFactory().getShape();
        shape1.draw();

        Shape shape2 =  new RectangleShapeFactory().getShape();
        shape2.draw();
    }
}
