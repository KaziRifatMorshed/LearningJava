package Lab_Test_3_2024;
// Kazi Rifat Morshed  230220
public class Square extends Rectangle {
    protected double side;

    public Square(double s) {
        super(s, s);
    }

    public double get_area() {
        return side * side;
    }

    public String toString() {
        return "Square{ Side: " + super.a + "}";
    }
}
