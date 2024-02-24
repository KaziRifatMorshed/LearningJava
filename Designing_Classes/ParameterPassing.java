package Designing_Classes;

public class ParameterPassing {
  // MAIN
  public static void main(String[] args) { 
    ParameterTester tester = new ParameterTester();

      int a1 = 111;
      Num a2 = new Num (222);
      Num a3 = new Num (333);

      System.out.println ("Before calling changeValues: (in MAIN method)");
      System.out.println ("a1\ta2\ta3");
      System.out.println (a1 + "\t" + a2 + "\t" + a3 + "\n");

      tester.changeValues (a1, a2, a3);

      System.out.println ("After calling changeValues: (in MAIN method)");
      System.out.println ("a1\ta2\ta3");
      System.out.println (a1 + "\t" + a2 + "\t" + a3 + "\n");
  }
}
/*
Before calling changeValues: (in MAIN method)
a1	a2	a3
111	222	333

Before changing the values: (in change value method)
f1	f2	f3
111	222	333 // new copy in new memory scope

After changing the values: (in change value method)
f1	f2	f3
999	888	777 // changed value in that memory scope

After calling changeValues: (in MAIN method)
a1	a2	a3
111	888	333

 */