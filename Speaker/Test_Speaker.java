package Speaker;
//********************************************************************
//  MiniQuiz.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a class that implements an interface.
//********************************************************************

import java.util.Scanner;

public class Test_Speaker {
    public static void main(String[] args) {
        Speaker guest = new Philosopher("Sabbir");
        guest.speak();
        guest = new Dog("Tom");
        guest.speak();
        System.out.println(guest);
    }
} // DONE
