package Concurrency.RaceCondition;

public class main_test_duel_counter {

    public static void main(String[] args) throws InterruptedException {
//    public static void main(String[] args) { এমন করতে চেলে হয় try-catch দিতে হবে বা throws InterruptedException এড করতেই হবে
        My_Counter a1 = new My_Counter(); // same object pass korbo duita thread er vitore
        My_Counter a2 = new My_Counter();
        Count_int_inc_Runnable b1 = new Count_int_inc_Runnable(a1);
        Count_int_inc_Runnable b2 = new Count_int_inc_Runnable(a2);

        Thread thread1 = new Thread(b1);
        thread1.setName("add thread_1");
        thread1.start();
//        thread1.join();

        Thread thread2 = new Thread(b2);
        thread2.setName("add thread_2");
        thread2.start();

        thread1.join();
        thread2.join();
        // জয়েন() না দিলে ভ্যালু একেবারে কম (২০০-৩০০ এর ঘরে) আসছে

        System.out.println(a1.value() + " " + a2.value() + " and " + (a1.value() + a2.value())); // 100000 100000 and 200000
        // দুইটা ভিন্ন ভ্যারিয়েবল আলাদাভাবে দুইটা থ্রেডে রান করায় এরা পরষ্পর ইন্টারেপ্ট করছে না
    }
}
