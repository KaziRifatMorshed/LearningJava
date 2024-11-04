package Inheritance;

public class test_student {
    public static void main(String[] args) {
        Student susan = new Student("Susan", 5);
        GradStudent frank = new GradStudent("Frank", 3, "Tuition", .75);
        System.out.println(susan);
        System.out.println();
        System.out.println(frank);
    }
} // done