package Concurrency.RaceCondition;

public class Count_int_inc_Runnable implements Runnable {
    private My_Counter counter1;

    public Count_int_inc_Runnable(My_Counter c) {
        this.counter1 = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            counter1.increment();
        }
    }
}
