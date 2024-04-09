/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labtest3_2023;

/**
 *
 * @author csepc
 */
public class TestClass {
    public static void main(String[] args){
        C1 c = new C1("Text1");
        c.print();
        System.out.println(c);
        c = new C2("Text2");
        c.print();
        System.out.println(c);
        Printable p = c;
        System.out.println(p);
        
    }
    
}
