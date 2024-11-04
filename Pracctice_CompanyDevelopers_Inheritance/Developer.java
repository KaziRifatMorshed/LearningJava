package Pracctice_CompanyDevelopers_Inheritance;
import java.util.*;
public class Developer extends Employee {
    private String platform;

    public Developer(String name, double salary, String platform) {
        super();
        this.name = name;
        this.salary = salary;
        this.platform = platform;
    }

    public String getName() {
        return this.name;
    }
} // done
