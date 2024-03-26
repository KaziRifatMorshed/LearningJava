package Interface.CD_Database;

import java.util.*;

public class Database {
    protected ArrayList<Item> p;

    public Database() {
        p = new ArrayList<>();
    }

    public void addItem(Object o) {
        Item _o = (Item) o;
        p.add(_o);
    }

    public void Sort() {
        Collections.sort(p); // NEW
    }

    public String toString() {
        String result = "";
        for (Item n : p) { // বার বার ভুলে যাই কেন তোমায়
            result += p.toString();
        }
        return result;
    }
}
