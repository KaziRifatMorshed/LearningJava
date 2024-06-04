package Exceptions;

public class Zero3 {

    public static void main(String[] args) {
        m1();
        System.out.println("7.main.This line will not execute");
    }

    // REMINDER public STATIC void m1()
    public static void m1() { // jate object chara call korte pare
        try {
            System.out.println("pre-m1");
            m2();
            System.out.println("post-m1");
        } catch (my_exception e) {
            System.out.println("pre-catch");
            e.printStackTrace();
            System.out.println("inside catch scope");
        } finally { // default na , oita may be C/CPP er switch case er
            System.out.println("inside default");
        }
        System.out.println("exception was handled and I am still here");
    }

    // throw new my_exception() দিলে method signature এ throws my_exception লেখা  বাধ্যতামূলক,
    // throws my_exception এর ভিতরে throw new my_exception() নাও থাকতে পারে
    public static void m2() throws my_exception { // jate object chara call korte pare
        System.out.println("pre");
        throw new my_exception("Abra ka dabra"); // return এর মত ?
//        System.out.println("post"); // IDE underlines this line as RED
    }

}
