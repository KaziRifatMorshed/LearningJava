package Exception;
public class Zero3 {
   public static void main (String[] args) {
      m1();
   }
   
   static void m1() {
       try {
           m2(-1);
       }
       catch(MyException e) {
         System.out.println (e.getMessage()); 
         //e.printStackTrace();
       }
       finally{
           System.out.println ("Exception was handled, I am still here");
       }
   }
   static void m2(int x) throws MyException {
     if (x<0)
        throw new MyException("This message is from my Exception");
   }
}
