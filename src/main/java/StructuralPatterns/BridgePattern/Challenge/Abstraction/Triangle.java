package StructuralPatterns.BridgePattern.Challenge.Abstraction;

import StructuralPatterns.BridgePattern.Challenge.Implementor.ColorInterface;

public class Triangle extends Shape {

    protected ColorInterface color;

    public Triangle(ColorInterface color) {
        super(color);

        this.color = color;
    }

    //Implementor specific method
    @Override
    public void drawShape(int border) {
        System.out.println("This triangle is filled with  ");
        color.fileWithColor(border);
    }

    //Abstraction specific method
    @Override
    public void modifyBorder(int border, int increment) {
        System.out.println("\n Now we are changing the border length " + increment + " times ");
        border = border * increment;
        drawShape(border);

    }
}
