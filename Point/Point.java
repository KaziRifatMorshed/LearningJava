// Kazi Rifat Morshed 230220
package Point;

public class Point {
    private double x;
    private double y;

    public Point(double _x, double _y){
        this.x = _x;
        this.y = _y;
    }

    public double distance(Point second){
        return Math.sqrt( Math.pow((x - second.x), 2) + Math.pow((y - second.y), 2) );
    }

    public String toString() {
        return STR."location is (\{x},\{y})";
    }
} // done