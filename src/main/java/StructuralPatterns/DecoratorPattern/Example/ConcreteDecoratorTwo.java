package StructuralPatterns.DecoratorPattern.Example;

public class ConcreteDecoratorTwo extends AbstractDecorator{

    @Override
    public void doJob() {
        //add additional responsibilities
        System.out.println("\n\n**** START ConcreteDecoratorTwo ***");

        super.doJob();

        System.out.println("I am from ConcreteDecoratorTwo");
        System.out.println("**** End ConcreteDecoratorTwo ***");

    }
}