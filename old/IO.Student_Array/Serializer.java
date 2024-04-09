package IO.Student_Array;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializer {
  
  public void serializeStudent_List(Student_List s){
    
    try{
      
      FileOutputStream fout = new FileOutputStream("student_list1.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fout);   
      oos.writeObject(s);
      oos.close();
      System.out.println("Done");
      
    }catch(Exception ex){
      ex.printStackTrace();
    }
  }
}