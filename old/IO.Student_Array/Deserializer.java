package IO.Student_Array;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Deserializer{

   public Student_List deserialzeStudent_List(){
    
    Student_List sList;
  
    try{
      
     FileInputStream fin = new FileInputStream("student_list.ser");
     ObjectInputStream ois = new ObjectInputStream(fin);
     sList = (Student_List) ois.readObject();
     ois.close();
    
     return sList;
     
    }catch(Exception ex){
     ex.printStackTrace();
     return null;
    } 
   } 
}