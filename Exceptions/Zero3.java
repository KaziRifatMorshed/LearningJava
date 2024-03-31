package Exceptions;

public class Zero3 {

    public static void main(String[] args) {
        m1();
        System.out.println("This line will not execute");
    }

    public static void m1() { // jate object chara call korte pare
        try {
            m2();
        } catch (my_exception e) {
            e.printStackTrace();
            System.out.println("inside scope");
        }
        System.out.println("exception was handled and I am still here");
    }

    public static void m2() throws my_exception { // jate object chara call korte pare
        throw new my_exception("Abra ka dabra"); // return এর মত ?
    }
}
