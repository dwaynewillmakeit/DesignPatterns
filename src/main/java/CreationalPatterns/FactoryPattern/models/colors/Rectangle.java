package CreationalPatterns.FactoryPattern.models.colors;

import CreationalPatterns.FactoryPattern.contracts.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle Draw");
    }
}
