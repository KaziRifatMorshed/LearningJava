package IO.Student_Array;
import java.util.*;
public class Deserializer_Test {
  
  public static void main (String args[]) {
    
    Deserializer deserializer = new Deserializer();
    Student_List sList = deserializer.deserialzeStudent_List();
    sList.show();
    Student s1 = sList.get(2);
    s1.show();
  } 
}
