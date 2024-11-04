package Inheritance;
public class Word {

    public static void main(String[] args) {
        Dictionary webster=new Dictionary();

        webster.pageMessage();
        webster.definitionMessage();
        System.out.println(STR."Number of pages(from Word): \{webster.pages}");
        System.out.println(STR."Number of pages(from Word): \{webster.getPages()}");
    }
}
