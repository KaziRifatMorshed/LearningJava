package Firm;

public class Volunteer extends StaffMember {

    public Volunteer(String _name, String _address, String _phone_no) {
        super(_name, _address, _phone_no);
    }

    @Override
    public double pay() {
        return 0.0;
    }
}
// done