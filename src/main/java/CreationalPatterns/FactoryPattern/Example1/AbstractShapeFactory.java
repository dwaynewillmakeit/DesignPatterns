package CreationalPatterns.FactoryPattern.Example1;

import CreationalPatterns.FactoryPattern.contracts.Shape;
import CreationalPatterns.FactoryPattern.models.colors.Circle;
import CreationalPatterns.FactoryPattern.models.colors.Rectangle;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }

}

class RectangleShapeFactory extends AbstractShapeFactory{

    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

class CircleFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
