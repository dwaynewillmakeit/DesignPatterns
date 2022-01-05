package CreationalPatterns.Prototype.Example;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String,Shape> shapeHashtable = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeHashtable.get(shapeId);

        System.out.println("Original Shape: "+ cachedShape);

        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){

        Circle circle =  new Circle();
        circle.setId("1");
        shapeHashtable.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeHashtable.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeHashtable.put(rectangle.getId(),rectangle);

    }
}
