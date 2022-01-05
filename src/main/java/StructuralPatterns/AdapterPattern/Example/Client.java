package StructuralPatterns.AdapterPattern.Example;

public class Client {

    public static void main(String[] args) {

        //*****This Example uses Object Composition****\\

        MallardDuck duck =  new MallardDuck();
        WildTurkey turkey =  new WildTurkey();

        //Convert turkey to a duck

        Duck turkeyAdapter =  new TurkeyAdapter(turkey);

        System.out.println("Turkey.....");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck...");
        testDuck(duck);

        System.out.println("\nAdapted Turkey...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
