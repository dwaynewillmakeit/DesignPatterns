package StructuralPatterns.DecoratorPattern.Example3.models;

import StructuralPatterns.DecoratorPattern.Example3.contracts.IceCream;
import StructuralPatterns.DecoratorPattern.Example3.contracts.IceCreamDecorator;

public class ChocolateTopping extends IceCreamDecorator {

    public ChocolateTopping(IceCream decoratedIceCream) {
        super(decoratedIceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Chocolate Toppings");
        return decoratedIceCream.cost() + 1.05;
    }
}
