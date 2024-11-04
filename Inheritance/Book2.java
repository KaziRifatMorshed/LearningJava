package Inheritance;

public class Book2 {
    protected int pages;

    public Book2(int numPages) { // NOTICE: CONSTRUCTOR IS PRESENT
        pages = numPages;
    }

    public void pageMessage() {
        System.out.println(STR."Number of pages(fromBook2): \{pages}");
    }
}
