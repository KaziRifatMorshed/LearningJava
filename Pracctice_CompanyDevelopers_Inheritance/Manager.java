package Pracctice_CompanyDevelopers_Inheritance;

import java.util.*;

public class Manager extends Employee {
    private int num_of_emp;
    ArrayList<Programmer> prog = new ArrayList<Programmer>();
    ArrayList<Developer> dev = new ArrayList<Developer>();

    public Manager(String name, double salary, int num_of_emp) {
        super();
        this.name = name;
        this.salary = salary;
        this.num_of_emp = num_of_emp;
    }

    public void addDeveloper(Developer d) {
        dev.add(d);
    }

    public void addProgrammer(Programmer p) {
        prog.add(p);
    }

    public void removeDeveloper(Developer d) {
        dev.remove(d);
    }

    public void removeProgrammer(Programmer p) {
        prog.remove(p);
    }

    public ArrayList<Programmer> getProgrammerList() {
        return prog;
    }

    public ArrayList<Developer> getDeveloperList() {
        return dev;
    }


} // done