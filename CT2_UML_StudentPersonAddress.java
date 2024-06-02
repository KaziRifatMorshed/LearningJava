class Address {
    String street;
    String city;
    String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address: " + street + ", " + city + ", " + state;
    }
}

class Person {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person: " + name + ", " + address;
    }
}

class Student extends Person {
    int id;

    public Student(int id, String name, Address address) {
        super(name, address);  // Call parent class constructor
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student: ID " + id + ", Name: " + name + ", Address: " + address;
    }
}

public class CT2_UML_StudentPersonAddress {

    public static void main(String[] args) {
        Address address = new Address("Hall Road", "Batiaghata", "Khulna");
        Person person = new Person("Anis", address);
        Student student = new Student(200201, "Siam", address);

        System.out.println(person);
        System.out.println("--------");
        System.out.println(student);
    }
}
