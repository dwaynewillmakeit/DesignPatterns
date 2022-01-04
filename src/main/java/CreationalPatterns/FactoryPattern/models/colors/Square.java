package CreationalPatterns.FactoryPattern.models.colors;

import CreationalPatterns.FactoryPattern.contracts.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside the Square draw method");
    }
}
