package Concurrency.RaceCondition;

public class main_test {
    public static void main(String[] args) throws InterruptedException {
//    public static void main(String[] args) { এমন করতে চেলে হয় try-catch দিতে হবে বা throws InterruptedException এড করতেই হবে
        My_Counter a = new My_Counter(); // same object pass korbo duita thread er vitore
        Count_int_inc_Runnable b = new Count_int_inc_Runnable(a);

        Thread thread1 = new Thread(b);
        thread1.setName("add thread_1");
        thread1.start();
//        thread1.join();

        Thread thread2 = new Thread(b);
        thread2.setName("add thread_2");
        thread2.start();

        thread1.join();
        thread2.join();
        // জয়েন() না দিলে ভ্যালু একেবারে কম (২০০-৩০০ এর ঘরে) আসছে

        System.out.println(a.value());
    }

}
