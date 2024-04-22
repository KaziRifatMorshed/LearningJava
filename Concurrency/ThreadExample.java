package Concurrency;

public class ThreadExample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            new Thread(STR."\{i}") {
                public void run() {
                    System.out.println(STR."Thread: \{getName()} running");
                }
            }.start();
        }
    }
}
/*
Thread: 5 running
Thread: 4 running
Thread: 7 running
Thread: 6 running
Thread: 1 running
Thread: 0 running
Thread: 8 running
Thread: 3 running
Thread: 9 running
Thread: 2 running
 */