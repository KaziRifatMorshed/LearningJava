package Overriding;

public class Advice extends Thought {

    // Prints a message. This method overrides the parent's version.
    // It also invokes the parent's version explicitly using super.
    // কন্সট্রাক্টর ছাড়াও কাজ করে
    public void message() {
        System.out.println("(Advice)Warning: Dates in calendar are closer than they appear.");
        super.message();
    }
}
