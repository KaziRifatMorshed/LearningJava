package IO.Student_database;

import java.io.*;

public class Main_Test {
    public static void main(String[] args) throws IOException {
        // Main class
        _Address ad = new _Address("Hall Road", "Batiyaghata", "Khulna");
        _Person p = new _Person("Anis", ad);
        _Person s = new _Student(230202, "Siam", ad);
//        System.out.println(p);
//        System.out.println("----------------------");
//        System.out.println(s);


        // -----------------------------------------------------
        try {
//            FileOutputStream file1 = new FileOutputStream("./IO/Student_database/we_are_students.ser");
            FileOutputStream file1 = new FileOutputStream("/home/noobcodermsi/Documents/GitHub/LearningJava/IO/Student_database/we_are_students.ser");
            ObjectOutputStream oos = new ObjectOutputStream(file1);

            oos.writeObject(p);
            oos.writeObject(s);

            oos.close();
            System.out.println("Done! writing code");


        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException();
        }
    }
}
