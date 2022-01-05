package StructuralPatterns.AdapterPattern.Example4.models;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
