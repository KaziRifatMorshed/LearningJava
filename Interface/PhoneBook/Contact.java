package Interface.PhoneBook;

public class Contact implements Comparable {
    String a, b, phn_no;

    public Contact(String a, String b, String c) {
        this.a = a;
        this.b = b;
        phn_no = c;
    }

    @Override
    public int compareTo(Object o) { // REMEMBER
        int result = 0;
        if (b.equals(((Contact) o).b)) {
            result = a.compareTo(((Contact) o).a);
        } else {
            result = b.compareTo(((Contact) o).b);
        }
        return result;
    }

    public String toString() {
        return STR."\{b} , \{a}\t\{phn_no}";
    }
}
