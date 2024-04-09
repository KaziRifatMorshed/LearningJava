/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author csepc
 */
public class MyClass {
    int x;

    public MyClass(int x) {
        this.x = x;
    }
    public void m1() {
       try {
           m2(x);
       }
       catch(MyException e) {
         System.out.println (e.getMessage()); 
         //e.printStackTrace();
       }
       finally{
           System.out.println ("Exception was handled");
       }
   }
   public void m2(int x) throws MyException {
     if (x<0)
        throw new MyException("Exception");
   }
    
}
