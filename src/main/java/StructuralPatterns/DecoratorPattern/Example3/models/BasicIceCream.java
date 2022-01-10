package StructuralPatterns.DecoratorPattern.Example3.models;

import StructuralPatterns.DecoratorPattern.Example3.contracts.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("Creating a basic ice cream");
    }

    @Override
    public double cost() {
        return 0.50;
    }
}
