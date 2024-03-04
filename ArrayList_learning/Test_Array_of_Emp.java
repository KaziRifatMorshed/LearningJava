package ArrayList_learning;

import java.util.*;
import java.lang.*;

public class Test_Array_of_Emp {
    public static void main(String[] args) {

        Emp[] employees = new Emp[3]; // syntax different

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Emp(i + 1, " ");
        }
        employees[0].setName("Anis");
        employees[1].setName("Karim");
        employees[2].setName("Rahim");

        // for (int i = 0; i < employees.length; i++) {
        for (Emp employee : employees) {
            System.out.println(employee);
        }
    }
}

