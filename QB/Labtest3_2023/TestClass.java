package Labtest3_2023;


public class TestClass {
    public static void main(String[] args) {
        C1 c = new C1("Text1");
        c.print(); // From print Method of C1 class: Text1
        System.out.println(c); // C1{text=Text1}
        c = new C2("Text2");
        c.print(); // From print Method of C2 class: Text2
        System.out.println(c); // C2{C1{text=Text2}}
        Printable p = c; // I guess, here Printable will work like a super class
        System.out.println(p); // C2{C1{text=Text2}}

    }
}
/*
OUTPUT:
From print Method of C1 class: Text1
C1{text=Text1}
From print Method of C2 class: Text2
C2{C1{text=Text2}}
C2{C1{text=Text2}}
 */
