package Lab_Test_3_2024;
// Kazi Rifat Morshed  230220
public class Shape {
    //protected double x, y;

    public Shape() {
    }

    public double get_area() {
        return 0;
    }

    public boolean equals(Object s) {
        Shape ssss = (Shape) s;
        return (this.get_area() == ssss.get_area());
    }


}
