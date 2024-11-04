package ManyObjects;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Sphere {
    float radius, area, volume;
    Scanner scan = new Scanner(System.in);
    // ভুল লিখতেছিলাম  NumberFormat formatter = NumberFormat
    DecimalFormat formatter = new DecimalFormat("0.##");

    public Sphere(){ // constructor
        System.out.print("input radius: ");;
        radius = scan.nextFloat();
        area = (float) (4 * Math.PI * Math.pow(radius, 2));
        volume = (float) ((4/3)*(Math.PI * Math.pow(radius, 3)));
    }

    public float getRadius(){
        return radius;
    }
    public float getArea() {
        return area;
    }
    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        // return super.toString(); // ManyObjects.Sphere@2f2c9b19
        return STR."এই গোল্লার ব্যাসার্ধ \{radius} == \{getRadius()} একক, আয়তন \{getVolume()} একক এবং পৃষ্ঠতলের ক্ষেত্রফল \{getArea()} which is \{formatter.format(getArea())} একেক ";
    }
    public static void main(){
        Sphere golla = new Sphere();
        System.out.println(STR."Halummmm, r = \{golla.getRadius()}, area = \{golla.getArea()}\n\{golla}");
    }
} // done