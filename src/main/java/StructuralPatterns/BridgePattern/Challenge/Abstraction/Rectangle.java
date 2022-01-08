package StructuralPatterns.BridgePattern.Challenge.Abstraction;

import StructuralPatterns.BridgePattern.Challenge.Implementor.ColorInterface;

public class Rectangle extends Shape {
    protected ColorInterface color;


    public Rectangle(ColorInterface color) {
        super(color);

        this.color = color;
    }

    //Implementor specific method
    @Override
    public void drawShape(int border) {
        System.out.println("This rectangle is filled with  ");
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
