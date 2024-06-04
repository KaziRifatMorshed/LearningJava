import Overriding.C;

class JavaCT3 {
    public static void main(String[] args) {
        A a = new A();
        a.m1(new B());

        a = new B();
        a.m1(new A()); // B এর ভিতরে প্যারামিটার হিসেবে A আছে এমন কোনো মেথড নাই, তাই কম্পাইলার সুপারক্লাসে খুজতে বের হবে A-class-প্যারানিটার ওয়ালা কোনো m1 মেথড আছে কি না
    }
}

class A {
    void m1(A a) {
        System.out.println("A");
    }
}

class B extends A {
    void m1(B b) {
        System.out.println("B");
    }
}
// output: A A