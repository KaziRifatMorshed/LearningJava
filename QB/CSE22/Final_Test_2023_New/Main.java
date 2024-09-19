package Final_Test_2023_New;
import java.util.*;

public class Main {
    public static void main(String[] args) {
               
        ArrayList<Shape> List = new ArrayList();
        List.add(new Rectangle(2,1));
        List.add(new Rectangle(1));
        System.out.println("Number of shapes created: "+ Shape.Count());
        Rectangle r = new Square(2);
        List.add(r);
        for(Shape s:List)
            System.out.println(s);
        System.out.println("Number of shapes created: "+ Shape.Count());
        
    }
}
    
