/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Test_2023;


public class Rectangle extends Shape{
    double length = 0;
    double width = 0;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length) {
        this.length = length;
        this.width = length;
    }
    public double Area(){
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{Length: "+length+ " Width: " + width+'}';
    }
    
}
