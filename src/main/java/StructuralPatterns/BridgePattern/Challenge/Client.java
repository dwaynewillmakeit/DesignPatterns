package StructuralPatterns.BridgePattern.Challenge;

import StructuralPatterns.BridgePattern.Challenge.Abstraction.Rectangle;
import StructuralPatterns.BridgePattern.Challenge.Abstraction.Shape;
import StructuralPatterns.BridgePattern.Challenge.Abstraction.Triangle;
import StructuralPatterns.BridgePattern.Challenge.Implementor.ColorInterface;
import StructuralPatterns.BridgePattern.Challenge.Implementor.GreenColor;
import StructuralPatterns.BridgePattern.Challenge.Implementor.RedColor;

public class Client {
    public static void main(String[] args) {
        System.out.println("****Bridge Patter****");


        System.out.println("\nColoring triangle to green");

        ColorInterface green = new GreenColor();
        Shape triangle = new Triangle(green);

        triangle.drawShape(20);
        triangle.modifyBorder(20,3);

        System.out.println("\n Coloring Rectangle red");
        ColorInterface red = new RedColor();
        Shape rectangle = new Rectangle(red);
        rectangle.drawShape(30);
        rectangle.modifyBorder(30,4);

    }
}
