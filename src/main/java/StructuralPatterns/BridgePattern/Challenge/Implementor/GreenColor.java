package StructuralPatterns.BridgePattern.Challenge.Implementor;

public class GreenColor implements ColorInterface{

    @Override
    public void fileWithColor(int border) {
        System.out.println("Green color with "+ border + " inch border");
    }
}
