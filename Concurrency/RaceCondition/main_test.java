package Concurrency.RaceCondition;

public class main_test {
    public static void main(String[] args) throws InterruptedException {
        My_Counter counter2 = new My_Counter();

        Thread thread1 = new Thread(new Count_int_inc_Runnable(counter2));
        thread1.setName("add thread_1");
        thread1.start();
//        thread1.join();

        Thread thread2 = new Thread(new Count_int_inc_Runnable(counter2));
        thread2.setName("add thread_2");
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter2.value());
    }

}
