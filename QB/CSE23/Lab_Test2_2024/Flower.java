// Kazi Rifat Morshed 230220
package Lab_Test2_2024;

public class Flower {
    protected String name = "Unknown Flower", color = "Unknown";

    public Flower() {
    }

    public Flower(String s1, String s2) {
        this.name = s1;
        this.color = s2;
    }

    @Override
    public String toString() {
        return "" + this.name + "{color=" + this.color + "}";
        // return STR."\{name}{color=\{color}}";
    }
}
