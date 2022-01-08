package StructuralPatterns.BridgePattern.Challenge.Implementor;

public class RedColor implements ColorInterface{
    @Override
    public void fileWithColor(int border) {
        System.out.println("Red color with "+ border + " inch border");
    }
}
