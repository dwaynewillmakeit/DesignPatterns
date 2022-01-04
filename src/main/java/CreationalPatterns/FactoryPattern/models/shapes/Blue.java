package CreationalPatterns.FactoryPattern.models.shapes;

import CreationalPatterns.FactoryPattern.contracts.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Blue color");
    }
}
