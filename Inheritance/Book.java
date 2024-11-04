package Inheritance;

public class Book {
    protected int pages = 1500;

    // notice: NO CONSTRUCTOR
    public void pageMessage() {
        System.out.println(STR."Number of pages(from Book): \{pages}");
    }
}
