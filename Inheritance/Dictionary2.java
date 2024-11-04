package Inheritance;

public class Dictionary2 extends Book2 {
    private int definitions;

    public Dictionary2(int numPages, int numDefinitions) {
        super(numPages);
        // Constructors are not inherited, even though they have
        // public visibility
        // Yet we often want to use the parent's constructor to set up
        // the "parent's part" of the object (?)
        // The super reference can be used to refer to the parent class,
        // and often is used to invoke the parent's constructor
        definitions = numDefinitions;
    }

//    public Dictionary2(int numDefinitions) {
//        this();
//        // super(numPages);
//        definitions = numDefinitions;
//    }


    public void definitionMessage() {
        super.pageMessage();
        System.out.println(STR."Number of definitions(fromDict2): \{definitions}");
        System.out.println(STR."Definitions per page(fromDict2): \{definitions / pages}");
    }
}