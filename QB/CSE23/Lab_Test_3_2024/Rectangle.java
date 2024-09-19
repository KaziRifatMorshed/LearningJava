package Lab_Test_3_2024;
// Kazi Rifat Morshed  230220
public class Rectangle extends Shape {
    protected double a, b;

    public Rectangle(double aa, double bb) {
        //super(aa,bb);
        a = aa;
        b = bb;
    }

    public double get_area() {
        return a * b;
    }

    public String toString() {
        return "Rectangle{Length:" + a + " Width: " + b + "}";
    }
}
