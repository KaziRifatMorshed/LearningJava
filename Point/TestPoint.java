package Point;

public class TestPoint {
    public static void main(String[] args){
        Point p1 = new Point(1,2);
        Point p2 = new Point(4,-7);
        double d = p1.distance(p2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(STR."the distance between p1 and p2 is \{d}");
        // System.out.printf("the distance between p1 and p2 is %.2f", d);

    }
} // done
