package Interface.CD_Database;

public class Item implements Comparable<Item> { // ATTENTION
    protected String name;
    protected int time;

    public Item(String n, int t) {
        name = n;
        time = t;
    }

    @Override
    public int compareTo(Item i) {
        if (this.time > i.time) {
            return 1;
        } else if (this.time < i.time) {
            return -1;
        } else {
            return this.name.compareTo(i.name); // careful
        }
    }

    @Override
    public String toString() {
        return STR. "\{ name } (\{ time }mins)\n" ;
    }
}
