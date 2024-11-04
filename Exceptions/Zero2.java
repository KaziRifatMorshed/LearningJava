package Exceptions;

public class Zero2 {
    public static void main(String[] args) {
        int nom = 10, denom = 0;
        m1(10, 0);
        System.out.println("This line will not execute");
    }

    public static void m1(int n, int d) { // jate object chara call korte pare
        m2(n, d);
        System.out.println("will not be printed");
    }

    public static void m2(int n, int d) { // jate object chara call korte pare
        System.out.println(n / d);
        System.out.println("will not be printed EITHER");
    }

}
/*
* Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Exceptions.Zero2.m2(Zero2.java:16)
	at Exceptions.Zero2.m1(Zero2.java:11)
	at Exceptions.Zero2.main(Zero2.java:6)
Process finished with exit code 1
* */