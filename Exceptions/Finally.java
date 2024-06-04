package Exceptions;

public class Finally {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        try {
            System.out.println(numerator / denominator);
            System.out.println("This text will not be printed.");
        }
//        catch (java.lang.Exception e) { // java: exception java.lang.ArithmeticException has already been caught
//            System.out.println("(java.lang.Exception) This text will be printed.");
//        } // কম্পাইল হবে না
        catch (java.lang.ArithmeticException e) {
            System.out.println("(java.lang.ArithmeticException) This text will be printed.");
        } catch (java.lang.Exception e) {
            System.out.println("(java.lang.Exception) This text will be printed.");
        } finally {
            System.out.println("FINALLY, This text will also be printed.");
        }
    }
}
/*
(java.lang.ArithmeticException) This text will be printed.
FINALLY, This text will also be printed.
* */