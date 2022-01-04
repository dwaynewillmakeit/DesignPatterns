package CreationalPatterns.AbstractFactoryPattern.Example1;

import CreationalPatterns.FactoryPattern.contracts.Color;
import CreationalPatterns.FactoryPattern.contracts.Shape;
import CreationalPatterns.FactoryPattern.models.shapes.Blue;
import CreationalPatterns.FactoryPattern.models.shapes.Green;
import CreationalPatterns.FactoryPattern.models.shapes.Red;

public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String colorType) {
        if(colorType==null)
            return null;

        if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        }else if(colorType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }else if(colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        }

        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}
