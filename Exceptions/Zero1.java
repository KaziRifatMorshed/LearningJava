package Exceptions;

public class Zero1 {
    public static void main(String[] args) {
        int nom = 10, denom = 0;
        System.out.println(nom / denom);
        System.out.println("This line will not execute");
    }
}
/*
/home/noobcodermsi/Documents/GitHub/LearningJava/out/production/LearningJava Exceptions.Zero1
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Exceptions.Zero1.main(Zero1.java:6)

Process finished with exit code 1
* */