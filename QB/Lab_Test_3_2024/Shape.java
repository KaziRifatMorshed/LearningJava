package Lab_Test_3_2024;

public abstract class Shape extends Object {

    abstract double Area();

    @Override
    public boolean equals(Object oooo) {
        Shape s = (Shape) oooo;
        return this.Area() == s.Area();
    }
}
