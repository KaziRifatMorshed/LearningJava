package Pracctice_CompanyDevelopers_Inheritance;
import java.util.*;
public class Programmer extends Employee {
    private String language;

    public Programmer(String name, double salary, String language) {
        super();
        this.name = name;
        this.salary = salary;
        this.language = language;
    }

    public String getName() {
        return this.name;
    }
} // done