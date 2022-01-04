package CreationalPatterns.FactoryPattern.models.shapes;

import CreationalPatterns.FactoryPattern.contracts.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green color");
    }
}
