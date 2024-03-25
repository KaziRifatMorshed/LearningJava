package Interface.CD_Database;

import java.util.*;

public class Database implements basic {
    protected String name, artist;
    protected int num_tracks, total_length_minutes;
    ArrayList<Database> p;

    public Database() {
        p = new ArrayList<>();
    }

    public void addItem(Object o) {
        Database _o = (Database) o;
        p.add(_o);
    }

    public void Sort() {

    }
}
