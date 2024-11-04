package Firm;

public class Employee extends StaffMember {
    protected double pay_rate;
    protected String NID;

    public Employee(String _name, String _address, String _phn, double _pay_rate, String _NID) {
        super(_name, _address, _phn);
        /* MISTAKEN, FORGOT
        name = _name;address = _address;phone_no = _phn;
        */
        // এমপ্লয়ি দের বেতন দিব বলে এনাইডি বা ব্যাংক একাউন্ট নম্বর আর পেমেন্ট রেট লাগবে যা এই ক্লাস আর সাবক্লাসে নতুন আবির্ভূত হবে
        pay_rate = _pay_rate;
        NID = _NID;
    }

    public double pay() {
        return pay_rate; // EH !!! // underclass e super.pay() use kora hoyeche
    }

    public String toString() { // kheyal rekho
        String result = super.toString();
        result += STR."\nNID no (for Bank Account): \{NID}\nPay rate: \{pay_rate}";
        return result;
    }

}
