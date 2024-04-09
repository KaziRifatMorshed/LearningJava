package Concurrency;
// use synchronized
//may use volatile
class MyCounter {
    
    private int c = 0;
    
    public void increment() {
        c++;
    }
    public   void decrement() {
        c--;
    }

    public  int value() {
        return c;
    }    
}