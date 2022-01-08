package StructuralPatterns.CompositePattern.Example2;

public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Dwayne",100,"Senior Dev");
        Employee dev2 = new Developer("John",102,"Junior Dev");
        Employee dev3 = new Developer("Suzette",103,"Lead Dev");

        Manager engManager = new Manager("Tom",45000);
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        Manager generalManager = new Manager("Mark",65000);
        generalManager.addEmployee(engManager);
        generalManager.addEmployee(dev3);


        System.out.println("\n**Engineering Manager**");
        engManager.showEmployeeDetails();
        System.out.println("\n**General Manager**");
        generalManager.showEmployeeDetails();
    }
}
