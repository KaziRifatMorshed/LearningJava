package Speaker;
//********************************************************************
//  MiniQuiz.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a class that implements an interface.
//********************************************************************

import java.util.Scanner;

public class Test_Speaker
{
   //-----------------------------------------------------------------
   //  Presents a short quiz.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
     Speaker guest = new Philosopher("Socretice");
     guest.speak();
     System.out.println(guest);
     guest = new Dog("Tom");
     guest.speak();
     System.out.println(guest);
     guest = new Cow("RajaBabu");
     System.out.println(guest);
   }
}
