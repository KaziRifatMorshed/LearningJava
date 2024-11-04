package Inheritance;

public class Student {
    protected String name;
    protected int numCourses;

    public Student(String _name, int _numCourses) {
        name = _name;
        numCourses = _numCourses;
    }

    public String toString() {
        return STR."Student Name: \{name} and \nnumber of courses: \{numCourses}";
    }
}
