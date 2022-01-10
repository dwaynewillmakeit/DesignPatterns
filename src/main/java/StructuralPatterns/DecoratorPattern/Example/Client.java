package StructuralPatterns.DecoratorPattern.Example;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** Decorator Pattern Demo ***");
        ConcreteComponent concreteComponent = new ConcreteComponent();

        ConcreteDecoratorOne decoratorOne = new ConcreteDecoratorOne();

        //Decorate the component
        decoratorOne.setComponent(concreteComponent);
        concreteComponent.doJob();

        ConcreteDecoratorTwo decoratorTwo = new ConcreteDecoratorTwo();

        //Decorate the component with both Decorator One and Two
        decoratorTwo.setComponent(decoratorOne);
        decoratorTwo.doJob();

    }
}
