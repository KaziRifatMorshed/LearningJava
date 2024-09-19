/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Test_2023;


/**
 *
 * @author CSE
 */
public class Triangle extends Shape{
    double base=0;
    double height=0;

    public Triangle(double base, double height) {
        //super("Triangle");
        this.base = base;
        this.height = height;
    }
    
    public double Area(){
        return 0.5*base*height;
    }

    @Override
    public String toString() {
        return "Triangle{Base: "+base+ " Height: " + height+'}';
    }
}
