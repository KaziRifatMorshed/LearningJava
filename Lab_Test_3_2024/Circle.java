package Lab_Test_3_2024;

public class Circle extends Shape{
    protected double r;
    public Circle(double rrr){
        r = rrr;
    }
    @Override
    public double Area(){
        return 3.14 * r * r;
    }
    @Override
    public String toString(){
        return STR."Circle{Radius: \{r}}";
    }
}
