package CreationalPatterns.FactoryPattern.models.shapes;

import CreationalPatterns.FactoryPattern.contracts.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red color");
    }
}
