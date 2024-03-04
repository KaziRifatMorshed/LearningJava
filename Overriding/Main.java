package Overriding;

public class Main {

    public static void main(String[] args) {

        Thought parked = new Thought(); // কন্সট্রাক্ট করার সময় কোনো আউটপুট আসে নাই
        Advice dates = new Advice(); // কন্সট্রাক্ট করার সময় কোনো আউটপুট আসে নাই
        parked.message();
        dates.message(); // overridden

    }
}
