package StructuralPatterns.BridgePattern.Example;

import StructuralPatterns.BridgePattern.Example.Abstractions.Bike;
import StructuralPatterns.BridgePattern.Example.Abstractions.Car;
import StructuralPatterns.BridgePattern.Example.Abstractions.Vehicle;
import StructuralPatterns.BridgePattern.Example.Implementors.Assemble;
import StructuralPatterns.BridgePattern.Example.Implementors.Produce;

public class Client {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Car(new Produce(),new Assemble());
        vehicle1.manufacture();

        Vehicle vehicle2 = new Bike(new Produce(),new Assemble());
        vehicle2.manufacture();
    }
}
