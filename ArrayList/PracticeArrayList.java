package ArrayList;

import java.util.ArrayList;

public class PracticeArrayList {


    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<Integer>(40);

        for (int i = 0; i < 20; ++i) {
            aList.add(i * i);
        }

        aList.set(0, 345);
        aList.add(45);

        int howMany = aList.size(); // allocated size
        System.out.println("How Many : " + howMany);
        // print
        for (int i = 0; i < 21; i++) {
            System.out.println(aList.get(i));
        }
    }
}
