package StructuralPatterns.DecoratorPattern.Example;

public class ConcreteDecoratorOne extends AbstractDecorator{

    @Override
    public void doJob() {
        super.doJob();

        //add additional responsibilities
        System.out.println("I am from ConcreteDecoratorOne");
    }
}
