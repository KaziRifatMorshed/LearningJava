package IO.Student_database;

public class _Student extends _Person {
    protected int stu_id;

    public _Student(int id, String name, _Address add) {
        super(name, add); // আগে সুপার কম করতে হবে
        stu_id = id;
    }

//    public int getStu_id() {
//        return stu_id;
//    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String toString() {
//        return "Id:" + stu_id + "\n" + super.toString();
        return STR."Id:\{stu_id}\n\{super.toString()}";
    }
}
