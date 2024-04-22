package Concurrency.RaceCondition;

public class My_Counter {
//    private volatile int c = 0; // didn't solve the issue
    private int c = 0;

//    public synchronized void increment() {
    public void increment() {
//        System.out.println(STR."before increment \{c}");
        c++;
//        System.out.println(STR."after increment \{c}");
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }
}
