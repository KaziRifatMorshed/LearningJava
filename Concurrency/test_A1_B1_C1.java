package Concurrency;

public class test_A1_B1_C1 {
    public static void main(String[] arg) {
        new A1().start();
        new B1().start();
        new C1().start();
    }
}
