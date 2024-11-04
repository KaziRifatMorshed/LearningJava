package Firm;

public class Hourly extends Employee {
    private int hoursWorked;

    public Hourly(String _name, String _address, String _phone_no, double _pay_rate, String NID) {
        super(_name, _address, _phone_no, _pay_rate, NID);
        hoursWorked = 0;
    }

    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    public double pay() {
        double payment = pay_rate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }

    public String toString() {
        String result = super.toString();
        result += STR."\nCurrent Hours \{hoursWorked}";
        return result;
    }

}
// done