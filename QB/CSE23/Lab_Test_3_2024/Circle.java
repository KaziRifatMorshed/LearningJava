package Lab_Test_3_2024;
// Kazi Rifat Morshed  230220
public class Circle extends Shape {
    protected double r;

    public Circle(double rr) {
        r = rr;
    }

    public double get_area() {
        return 3.14 * r * r;
    }

    public String toString() {
        return "Circle{Radius: " + r + "}";
    }
}
