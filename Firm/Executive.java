package Firm;

public class Executive extends Employee {
    private double bonus;

    public Executive(String _name, String _address, String _phone_no, double _pay_rate, String NID) {
        super(_name, _address, _phone_no, _pay_rate, NID); // careful
        bonus = 0;
    }

    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    @Override
    public double pay() {
        double payment = super.pay() + bonus;
        bonus = 0;
        return payment;
    }
}
