/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labtest3_2023;

/**
 *
 * @author csepc
 */
public class C2 extends C1 {

    public C2(String text) {
        super(text);
    }
    public void print(){
        System.out.println("From print Method of C2 class: "+text);
    }

    @Override
    public String toString() {
        return "C2{" + super.toString()+'}';
    }
    
}
