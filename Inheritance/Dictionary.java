package Inheritance;

public class Dictionary extends Book {
    private int definitions = 52500;

    public void definitionMessage() {
        System.out.println(STR."Number of definitions(from Dict): \{definitions}");

        System.out.println(STR."Definitions per page(from Dict): \{definitions / pages}");
    }
    public int getPages(){
        // System.out.println(STR."Number of pages(from DictGetPages): \{pages}");
    return pages;
    }
}

