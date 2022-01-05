package StructuralPatterns.AdapterPattern.Example;

public class TurkeyAdapter implements Duck{

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }


    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        //Because turkey flys for a short period it has to fly five times to equal one duck fly
        for (int i=0; i<5; i++){
        turkey.fly();

        }
    }
}
