package CreationalPatterns.AbstractFactoryPattern.Example1;

import CreationalPatterns.FactoryPattern.contracts.Color;
import CreationalPatterns.FactoryPattern.contracts.Shape;
import CreationalPatterns.FactoryPattern.models.colors.Circle;
import CreationalPatterns.FactoryPattern.models.colors.Rectangle;
import CreationalPatterns.FactoryPattern.models.colors.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String colorType) {
        return null;
        // This violates the interface segregation principle
    }

    @Override
    Shape getShape(String shapeType) {
        if(shapeType == null)
            return null;

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
        return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
