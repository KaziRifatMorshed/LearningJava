package IO.Student_database;

import Project.Student_database.Person;

import java.io.*;

public class Main_ReadData {
    public static void main(String[] args) {
        _Person inputted_person = null;
        _Address inputted_address = null;

        try {
            FileInputStream file2 = new FileInputStream("./IO/Student_database/we_are_students.ser");
            ObjectInputStream ois = new ObjectInputStream(file2);

            // while (ois.readObject() != null) { // ফার্স্ট অবজেক্ট কে এই লাইনের পড়ে নিচ্ছে
            while (true) { // ERROR HERE
                try {
                    inputted_person = (_Person) ois.readObject();
                    System.out.println(inputted_person);
                    System.out.println("----------------------------------------------");
                } catch (EOFException e) {
                    break;
                }
            } // YAHOO

            System.out.println("\nDONE");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
} // Hurrah Done
