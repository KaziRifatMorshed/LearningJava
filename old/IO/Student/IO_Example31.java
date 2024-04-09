package IO.Student;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class IO_Example31 {
  
  public static void main(String[] args)
  {
    String fileName = null; // outside try block, can be used in catch
    PrintWriter outputStream = null;
    try
    { Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter file name:");
      fileName = keyboard.next();
      outputStream = new PrintWriter(new FileOutputStream(fileName));
      CD c = new CD("Eagles","James",7,50);
      CD c2 = new CD("AAA","BBB",3,55);
      outputStream.println(c);
      outputStream.println(c2);
      outputStream.close();
      }
      //System.out.println(line);
     
 
    catch(FileNotFoundException e)
    {
      System.out.println("File " + fileName + " not found.");
    }
    catch(IOException e)
    {
      System.out.println("Error reading from file " + fileName);
    }  
    
  }
}
