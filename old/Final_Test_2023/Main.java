package Final_Test_2023;
import java.util.*;

public class Main {
    public static void main(String[] args) {
               
        Shape t1 = new Triangle(2,1);
        Triangle t2 = new Triangle(6,2);
        Rectangle r1 = new Rectangle(2,1);
        Cal_Area r2 = new Rectangle(1);
        
        System.out.println("Area of " + r1 + " is "+r1.Area());
        if(t1.equals(t2))
            System.out.println(t1+" and "+ t2 + " have same area." );
        else
            System.out.println(t1+" and "+ t2 + " have different area." );
        if(t1.equals(r2))
            System.out.println(t1+" and "+ r2 + " have same area." );
        else
            System.out.println(t1+" and "+ r2 + " have different area." );
    }
}
    
