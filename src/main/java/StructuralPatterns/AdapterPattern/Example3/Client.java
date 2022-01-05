package StructuralPatterns.AdapterPattern.Example3;

public class Client {

    public static void main(String[] args) {
        System.out.println("***Class and Object Adapter Demo");
        ClassAdapter classAdapter =  new ClassAdapter();
        System.out.println("Class Adapter returns: "+ classAdapter.getInteger());

        ObjectAdapter objectAdapter = new ObjectAdapter(new IntegerValue());
        System.out.println("Object Adapter is returning : "+objectAdapter.getInteger());
    }
}
