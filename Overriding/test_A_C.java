package Overriding;

public class test_A_C {
    public static void main(String[] args) {
        A a = new A();
        C c = new C();

        A a1 = new C(); // parent class type er subclass er object creat kora jay
        // C c1 = (C) new A(); // typecasting er por o error ase

        a.m1();
        c.m1();
        a1.m1();
        // c.super.m1(); // kam kore na

        // experimenting toString
        System.out.println(STR."\n\{a}\n\{c}");
    }
}
