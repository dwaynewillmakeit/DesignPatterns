package StructuralPatterns.CompositePattern.Challenge;

public class Professor implements Faculty {
    //Leaf

    private String name;
    private String position;
    private int officeNUmber;

    public Professor(String name, String position, int officeNUmber) {
        this.name = name;
        this.position = position;
        this.officeNUmber = officeNUmber;
    }

    @Override
    public String getDetails() {
        return name + " is the " + position;
    }

}
