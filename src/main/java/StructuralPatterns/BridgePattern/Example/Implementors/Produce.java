package StructuralPatterns.BridgePattern.Example.Implementors;

public class Produce extends Workshop{
    @Override
    public void work() {
        System.out.println("Produced");
    }
}
