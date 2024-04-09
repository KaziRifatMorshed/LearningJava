package Exception;
import java.util.*;
import java.util.Scanner;
public class ProductCodes {
  
  
  public static void main(String[] args) { 
    Scanner scan = new Scanner (System.in);
    
    String code;
    code = scan.nextLine();
    
    try {
      int y =0;
      System.out.println(1/y);
      int zone = code.charAt(9);
      int district = Integer.parseInt(code.substring(3, 7));
    }
    
    catch (StringIndexOutOfBoundsException e)
    {
      //System.out.println ("Improper code length: " + code);
      e.printStackTrace();
    } 
    catch (NumberFormatException exception)
    {
      System.out.println ("District is not numeric: " + code);
    }
    catch (Exception e)
    {
      //System.out.println (e.getMessage());
      //e.getMessage();
      e.printStackTrace();
    } 
  
  }
  
  
  
}
