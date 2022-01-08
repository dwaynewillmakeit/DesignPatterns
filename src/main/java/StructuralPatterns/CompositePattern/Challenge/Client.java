package StructuralPatterns.CompositePattern.Challenge;

public class Client {

    public static void main(String[] args) {
        Supervisor technologyDean = new Supervisor("Dr Kean", "Dean of Technology");
        Supervisor chairOfMathDepartment = new Supervisor("Dr Williams", "Chair of Math Department");
        Supervisor chairOfComputerScienceDepartment = new Supervisor("Dr. Goldberg", "Chair of CS Department");

        Professor mathProfessor = new Professor("Math Professor 1","Adjunct",302);
        Professor mathProfessor2 = new Professor("Math Professor 2","Adjunct",303);

        Professor cseProfessor1 = new Professor("CSE Professor 1","Adjunct",507);
        Professor cseProfessor2 = new Professor("CSE Professor 2","Professor",507);
        Professor cseProfessor3 = new Professor("CSE Professor 3","Professor",507);

        //Now we group them
        technologyDean.add(chairOfComputerScienceDepartment);
        technologyDean.add(chairOfMathDepartment);

        chairOfMathDepartment.add(mathProfessor);
        chairOfMathDepartment.add(mathProfessor2);

        chairOfComputerScienceDepartment.add(cseProfessor1);
        chairOfComputerScienceDepartment.add(cseProfessor2);
        chairOfComputerScienceDepartment.add(cseProfessor3);

        System.out.println("***COMPOSITE PATTERN DEMO***");
        System.out.println("\nThe college has the following structure\n");

        System.out.println(technologyDean.getDetails());

        technologyDean.getMyFaculty().forEach(faculty -> {
            System.out.println("\t"+faculty.getDetails());
        });

        chairOfMathDepartment.getMyFaculty().forEach(faculty -> {
            System.out.println("\t\t"+faculty.getDetails());
        });

        chairOfComputerScienceDepartment.getMyFaculty().forEach(faculty -> {
            System.out.println("\t\t"+faculty.getDetails());
        });
    }
}
