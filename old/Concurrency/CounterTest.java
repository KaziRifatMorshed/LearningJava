package Concurrency;
public class CounterTest {    
    public static void main(String[] args) throws InterruptedException {   
        MyCounter counter = new MyCounter();
        MyCounter counter2 = new MyCounter();
        
        Thread thread1 = new Thread(new CounterIncRunnable(counter));
        thread1.setName("add thread");
        thread1.start();

        Thread thread2 = new Thread(new CounterIncRunnable(counter2));
        thread2.setName("add thread2");
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.value());
        System.out.println(counter2.value());
    }    
}

