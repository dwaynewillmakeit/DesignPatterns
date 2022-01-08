package StructuralPatterns.CompositePattern.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {

    private String name;
    private String departmentName;

    private List<Faculty> faculties ;

    public Supervisor(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        faculties = new ArrayList<>();
    }

    public void add(Faculty professor) {
        faculties.add(professor);
    }

    public void remove(Faculty professor) {
        faculties.remove(professor);
    }

    public List<Faculty> getMyFaculty() {
        return faculties;
    }

    @Override
    public String getDetails() {
        return name + " is the " + departmentName;
    }
}
