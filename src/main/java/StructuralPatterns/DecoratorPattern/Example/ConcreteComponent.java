package StructuralPatterns.DecoratorPattern.Example;

public class ConcreteComponent extends Component{

    @Override
    public void doJob() {
        System.out.println("I am from a Concrete Component -  I am closed for modification");
    }
}
