package IO.Student_Array;
public class Serializer_Test {
  
  public static void main (String args[]) {
    
    Student_List s = new Student_List();
    s.addStudent(new Student("Anis",12,99));
    s.addStudent(new Student("Roja",13,98));
    s.addStudent(new Student("Sumon",14,97));
    
    Serializer serializer = new Serializer();
    serializer.serializeStudent_List(s);
  } 
}
