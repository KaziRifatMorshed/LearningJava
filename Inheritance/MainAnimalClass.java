package Inheritance;

public class MainAnimalClass {

    public static void main(String[] args) {
        Animal a = new Animal();
        Bird b = new Bird();
        Dog d = new Dog("Tommy");

        a = b; // Super Class can hold subclass reference
        // d = b; //  Does not work

        System.out.println();
        a.sleep();
        a.eat();
        System.out.println();
        b.sleep();
        b.eat();
        System.out.println();
        d.sleep();
        d.eat();
    }
}
