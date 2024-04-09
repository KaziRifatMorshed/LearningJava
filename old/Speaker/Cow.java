/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Speaker;

/**
 *
 * @author csepc
 */
public class Cow implements Speaker {
    String name;

    public Cow(String name) {
        this.name = name;
    }
    public void speak()
   {
      System.out.println("Hamba");
   }

    @Override
    public String toString() {
        return "Cow{" + "name=" + name + '}';
    }
    
    
}
