package IO.Student_database;

public class Main_Test {
    public static void main(String[] args) {
        // Main class
        _Address ad = new _Address("Hall Road", "Batiyaghata", "Khulna");
        _Person p = new _Person("Anis", ad);
        _Person s = new _Student(200201, "Siam", ad);
        System.out.println(p);
        System.out.println("----------------------");
        System.out.println(s);
    }
}
