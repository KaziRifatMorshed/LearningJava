package QB.CSE22.FLT;

public class Lotus extends Plant implements Smell {
    protected String lotus_name;
    protected int num_leaves = 1024;
    protected boolean is_smelling = false;
    static int count = 0;

    public Lotus(String s1) {
        super("Lotus");
        lotus_name = s1;
        count++;
    }

    public Lotus(String s1, int n) {
        super("Lotus");
        lotus_name = s1;
        num_leaves = n;
        count++;
    }

    public static int getNumLotuses() {
        // return STR."\{count}";
        return count;
    }

    public String getName() {
        return STR."\{plant_name}:\{lotus_name} has \{num_leaves} leaves";
    }

    @Override
    public void smellOn() {
        this.is_smelling = true;
    }

    public String toString() {
        String result = getName();
        if (is_smelling) {
            result += "  and it is spreading smell";
        } else {
            result += "  and it is not spreading smell";
        }
        return result;
    }
} // DONE