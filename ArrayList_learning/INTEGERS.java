package ArrayList_learning;

import java.util.ArrayList;

public class INTEGERS {
    ArrayList<Integer> i = new ArrayList<Integer>();


    public void addAL(int j) {
        i.add(j);
    }

    public void make() {
        for (int j = 0; j < 5; j++) {
            i.add(j * j);
        }
    }

    public void display() {
        for (int j = 0; j < i.size(); j++) {
            System.out.println(i.get(j)); // i.get(j) FORGOT
        }
    }

    public INTEGERS() {
    }
}

class _main {
    public static void main(String[] args) {
        INTEGERS iii = new INTEGERS();
        iii.make();
        iii.display();
    }
} // WORKS