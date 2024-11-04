package Concurrency;

//public class C1 extends Thread{
public class C1 {
    public void start() {
        System.out.println("Thread C is started");
        for (int i = 1; i <= 50; i++) {
            System.out.println(STR."............\t\t\tfrom thread C, i = \{i}"
            );
        }
        System.out.println("Thread C exiting");
    }

}
