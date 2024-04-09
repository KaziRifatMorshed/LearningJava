package IO.Student_Array;
import java.util.*;
import java.io.Serializable;

public class Student_List implements Serializable{

    ArrayList<Student> sList = new ArrayList<Student>();
    
    
    public void addStudent(Student s){
     sList.add(s);
    }
    
    public Student get(int index){
     return sList.get(index);
    }
    
    @Override
    public String toString() {
      StringBuffer sb = new StringBuffer("");
      for (Student s : sList) {
            sb.append(s);
        }
      
      return sb.toString();
    }
    
    public void show() {
      System.out.println("Student List:");
      for (Student s : sList) {
            s.show();
        }
    }
    
}