package ArrayList_learning;

class Emp {
    int employee_no;
    String name;

    public Emp(int employee_no, String name) {
        this.employee_no = employee_no;
        this.name = name;
    }

    public Emp(String name) {
        this.employee_no = -1;
        this.name = name;
    }

    public Emp(int employee_no) {
        this.employee_no = employee_no;
        this.name = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployee_no(int employee_no) {
        this.employee_no = employee_no;
    }

    @Override
    public boolean equals(Object obj) { // MOST IMPORTANT
        Emp e = (Emp) obj;
        return (this.employee_no == e.employee_no || e.name.equals(this.name)); // equals() method of string class
    }

    public boolean isEqual(Object ooo) {
        Emp e = (Emp) ooo;
        return (this.employee_no == e.employee_no || this.name.equals(e.name));
    }

    public String toString() {
        return STR."Employee No: \{employee_no}\tName: \{name}";
    }

    // this does NOT work
    //public void toString() {
    //    String m = STR."\nEmployee No: \{employee_no}\tName: \{name}";
    //    System.out.println(m);
    //}
}