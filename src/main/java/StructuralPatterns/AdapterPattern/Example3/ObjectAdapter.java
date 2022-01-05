package StructuralPatterns.AdapterPattern.Example3;

public class ObjectAdapter {

    private  IntegerValueInterface integerValueInterface;

    public ObjectAdapter(IntegerValueInterface integerValueInterface) {
        this.integerValueInterface = integerValueInterface;
    }

    public int getInteger(){
        return 2 + integerValueInterface.getInteger();
    }
}
