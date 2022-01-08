package StructuralPatterns.CompositePattern.Example2;

public class Developer implements Employee {
    //LEAF

    private String name;
    private long employeeId;
    private String position;

    public Developer(String name, long employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {

        System.out.println(employeeId+" "+name+" "+ position);
    }
}
