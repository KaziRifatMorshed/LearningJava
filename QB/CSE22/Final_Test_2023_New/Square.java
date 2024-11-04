/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Test_2023_New;

/**
 *
 * @author CSE
 */
public class Square extends Rectangle {
    public Square(double length) {
        super(length);
    }

    @Override
    public String toString() {
        return "Square{ Side: " +length+ "} Area = " + Area();
    }
      
}
