package StructuralPatterns.DecoratorPattern.Example3.models;

import StructuralPatterns.DecoratorPattern.Example3.contracts.IceCream;
import StructuralPatterns.DecoratorPattern.Example3.contracts.IceCreamDecorator;

public class PeanutTopping extends IceCreamDecorator {

    public PeanutTopping(IceCream decoratedIceCream) {
        super(decoratedIceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Peanut Toppings");
        return 1.03 + super.cost();
    }
}
