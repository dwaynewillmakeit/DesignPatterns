package CreationalPatterns.FactoryPattern.Example2;

import CreationalPatterns.FactoryPattern.contracts.Shape;
import CreationalPatterns.FactoryPattern.models.colors.Circle;
import CreationalPatterns.FactoryPattern.models.colors.Rectangle;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType==null) {
            return null;
        }else if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }

        return null;
    }
}
