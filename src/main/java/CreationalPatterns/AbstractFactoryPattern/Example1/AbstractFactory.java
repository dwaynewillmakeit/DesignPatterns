package CreationalPatterns.AbstractFactoryPattern.Example1;

import CreationalPatterns.FactoryPattern.contracts.Color;
import CreationalPatterns.FactoryPattern.contracts.Shape;

public abstract class AbstractFactory {

    abstract Color getColor (String colorType);
    abstract Shape getShape(String shapeType);
}
