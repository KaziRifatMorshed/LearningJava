package Exception;
import java.util.*;
import java.util.Scanner;

public class CourseCodes
{
//-----------------------------------------------------------------
// Counts the number of valid course (like XXX-9999)codes that are entered 
//-----------------------------------------------------------------
  public static void main (String[] args)
  {
    String code;
    char t_s;
    int theory=0, sessional=0, invalid = 0;
    boolean isTheory=true;
    System.out.print ("Enter course code (XXX to quit): ");
    Scanner scan = new Scanner (System.in);
    code = scan.nextLine();
    
    while (!code.equals ("XXX"))
    {
      try
      {
        t_s = code.charAt(7);
        int numeric_part = Integer.parseInt(code.substring(4, 8));
        isTheory = ((((int)t_s)%2)==1);
        if(isTheory)
          theory++;
        else
          sessional++;
      }
      catch (StringIndexOutOfBoundsException exception)
      {
          invalid++;
          System.out.println ("Improper code length: " + code);
      }
      catch (NumberFormatException exception)
      {
          invalid++;
          System.out.println ("5-8 digits are not numeric: " + code);
      }
      System.out.print ("Enter product code (XXX to quit): ");
      code = scan.nextLine();
    }
    System.out.println ("# of invalid courses entered: " + invalid);
    System.out.println ("# of valid theory courses entered: " + theory);
    System.out.println ("# of valid sessional courses entered: " + sessional);
  }
}