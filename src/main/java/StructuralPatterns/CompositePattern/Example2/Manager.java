package StructuralPatterns.CompositePattern.Example2;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //This is the composite
    private List<Employee> employeeList = new ArrayList<>();



    @Override
    public void showEmployeeDetails() {

        System.out.println("_____________");
        System.out.println("Name = "+getName());
        System.out.println("Salary = "+ getSalary());
        System.out.println("_____________");

        employeeList.forEach(Employee::showEmployeeDetails);
    }

    public Employee getChild(int i){
        return employeeList.get(i);
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
