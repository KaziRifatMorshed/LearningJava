package ArrayList_learning;

import java.util.ArrayList;

public class test_Students {
    public void main(String[] args) {
        ArrayList<CSEKU_recursive23> students = new ArrayList<>();

        students.add(new CSEKU_recursive23("Seam", 1));
        CSEKU_recursive23 siam2 = new CSEKU_recursive23("Siam", 2);
        CSEKU_recursive23 kawsar = new CSEKU_recursive23("Kawsar", 3);
        CSEKU_recursive23 zero_four = new CSEKU_recursive23("Sabbir", 4);
        CSEKU_recursive23 shelby = new CSEKU_recursive23("Shibly", 6);
        boolean p = students.add(siam2);
        students.add(kawsar);
        students.add(zero_four);
        students.add(shelby);
        // students.add(18, new CSEKU_recursive23("Turjow", 18)); // ERROR
        students.add(new CSEKU_recursive23("Turjow", 18));
        students.remove(1);

        System.out.println(p);
        System.out.println(students);
        // System.out.println(students.getFirst());


        for (CSEKU_recursive23 k : students) {
            // System.out.println(students); // WRONG
            System.out.println(k);
        }

        System.out.println(students.indexOf(zero_four) + 1);
        System.out.println(students.contains(shelby));
        System.out.println(STR."students.contains(siam2): \{students.contains(siam2)}");

        students.clear();
    }
}
