package Firm;

public class Staff { // staff class contains staff lis
    private StaffMember[] _staff_list_; // Array of StaffMember[]

    public Staff() {
        _staff_list_ = new StaffMember[6];
        _staff_list_[0] = new Executive("Shahriar Seam", "Sherpur", "019874563", 2475.63, "123456789");
        _staff_list_[1] = new Employee("Turjow", "Satkhira", "0173214568", 4520, "321456789");
        _staff_list_[2] = new Employee("Durjay", "Rupsha", "013987456", 4680, "546987321");
        _staff_list_[3] = new Hourly("Kazi", "Gollamari", "01598774268", 120, "546987321");
        _staff_list_[4] = new Volunteer("Mashrafi", "Gaibandha", "012874415");
        _staff_list_[5] = new Volunteer("Saadiq", "Nirala", "0167894615");

        // _staff_list_[0].awardBonus(); // লাল দেখায়, invalid
        ((Executive) _staff_list_[0]).awardBonus(500.0);
        ((Hourly) _staff_list_[3]).addHours(40);
    }

    public double payday() { // an automated method to pay all at once
        double amount = 0;

        // for (int i = 0; i < _staff_list_.length; i++) {
        for (StaffMember staff_Member : _staff_list_) {
            /* toString */
            System.out.println(staff_Member);
            amount = staff_Member.pay(); // polymorphism !!!!!
            if (amount == 0) {
                System.out.println("Thanks !!!");
            } else {
                System.out.println(STR."Paid: \{amount} taka");
            }
            System.out.println("=======================================");
        }
        return amount;
    }
}
