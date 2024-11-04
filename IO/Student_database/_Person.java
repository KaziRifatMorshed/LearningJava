package IO.Student_database;

import java.io.Serializable;

public class _Person implements Serializable {
    protected String name;
    protected _Address address;

    public _Person(String s1, _Address ad) {
        name = s1;
        address = ad;
    }

    public String getName() {
        return name;
    }

    public _Address getAdd() {
        return address;
    }

    @Override
    public String toString() {
//        return "name=" + name + "\n" + address;
        return STR."name=\{name}\n\{address}";
    }
}
