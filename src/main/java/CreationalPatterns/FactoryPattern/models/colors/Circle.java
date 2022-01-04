package CreationalPatterns.FactoryPattern.models.colors;

import CreationalPatterns.FactoryPattern.contracts.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle draw");
    }
}
