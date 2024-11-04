package Concurrency;

public class B1 extends Thread {

    public void run() {
        System.out.println("Thread B is started");
        for (int i = 1; i <= 50; i++) {
            System.out.println(STR."......\tfrom thread B, i = \{i}"
            );
        }
        System.out.println("Thread B exiting");
    }

}
