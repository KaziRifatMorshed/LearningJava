package Lab_Test_3_2024;

public class Rectangle extends Shape {
    protected double a, b;

    public Rectangle(double x, double y) {
        a = x;
        b = y;
    }

    @Override
    double Area() {
        return a * b;
    }

    @Override
    public String toString(){
        return STR."Rectangle{Length:\{a} Width: \{b}}";
    }
}
