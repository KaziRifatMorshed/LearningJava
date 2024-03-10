package Firm;

public abstract class StaffMember { // নাটের গুরু ক্লাস
    protected String name, address, phone_no;

    public StaffMember(String name, String address, String phone_no) {
        this.name = name;
        this.address = address;
        this.phone_no = phone_no;
    }

    public String toString() {
        // String result = STR."Name: \{name}\nAddress: \{address}\nPhone: \{phone_no}";
        return STR."Name: \{name}\nAddress: \{address}\nPhone: \{phone_no}";
    }

    public abstract double pay();
}
