package StructuralPatterns.FacadePattern.Example2;

public class Memory {

    public void load(long position, byte[] data){
        System.out.println("Added item to memory..."+position);
    }
}