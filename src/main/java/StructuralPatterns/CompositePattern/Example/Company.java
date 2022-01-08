package StructuralPatterns.CompositePattern.Example;

public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Dwayne",100,"Senior Dev");
        Employee dev2 = new Developer("John",100,"Junior Dev");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee manager1 = new Manager("Jane",200,"IT Manager");
        Employee manager2 = new Manager("Jack",201,"Accounts Manager");

        Directory managersDirectory = new Directory();
        managersDirectory.addEmployee(manager1);
        managersDirectory.addEmployee(manager2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(managersDirectory);

        System.out.println("\n**Engineering Team**");
        engDirectory.showEmployeeDetails();
        System.out.println("\n**Managers Team**");
        managersDirectory.showEmployeeDetails();
        System.out.println("\n**Company Directory**");
        companyDirectory.showEmployeeDetails();
    }
}
