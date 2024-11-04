package Concurrency;

public class A1 extends Thread {
    public void run() {
        System.out.println("Thread A is started");
        for (int i = 1; i <= 50; i++) {
            System.out.println(STR."from thread A, i = \{i}"
            );
        }
        System.out.println("Thread A exiting");
    }
}
