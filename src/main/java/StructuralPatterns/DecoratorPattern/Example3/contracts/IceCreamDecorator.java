package StructuralPatterns.DecoratorPattern.Example3.contracts;

public abstract class IceCreamDecorator implements IceCream{

    protected IceCream decoratedIceCream;

    public IceCreamDecorator(IceCream decoratedIceCream) {
        this.decoratedIceCream = decoratedIceCream;
    }

    @Override
    public double cost() {
        return this.decoratedIceCream.cost();
    }
}
