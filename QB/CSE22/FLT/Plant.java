package QB.CSE22.FLT;

public class Plant {
    protected String plant_name;
    static int count = 0;

    public Plant(String s) {
        plant_name = s;
        count++;
    }

    public static int getNumPlants() {
        // return STR."There are \{count} plants.";
        return count;
    }

    public String toString() {
        return STR."\{plant_name} is a plant";
    }
} // DONE