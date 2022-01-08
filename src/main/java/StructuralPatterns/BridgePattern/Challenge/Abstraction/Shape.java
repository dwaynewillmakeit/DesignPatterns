package StructuralPatterns.BridgePattern.Challenge.Abstraction;

import StructuralPatterns.BridgePattern.Challenge.Implementor.ColorInterface;

public abstract class Shape {

    private ColorInterface color;

    protected Shape(ColorInterface color) {
        this.color = color;
    }

    public abstract void drawShape(int border);
    public abstract void modifyBorder(int border, int increment);
}
