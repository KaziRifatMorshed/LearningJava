package Speaker;

public class Philosopher implements Speaker {
    protected String name;

    public Philosopher(String s) {
        name = s;
    }

    @Override
    public void speak() {
        System.out.println(STR."Philosopher \{name} is speaking");
    }

    @Override
    public String toString() {
        return "Philosopher speaks, listen to him carefully";
    }
}
