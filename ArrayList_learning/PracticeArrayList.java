package ArrayList_learning;

import java.util.ArrayList;

public class PracticeArrayList {


    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<Integer>(40); // ArrayList<Integer>

        for (int i = 0; i < 20; ++i) {
            aList.add(i * i); // aList.add(i * i);
        }

        aList.set(0, 345);
        int p = aList.set(7, 94); // রিপ্লেস করার আগে যেটা ছিলো সেটা রিটার্ণ করবে
        System.out.println(STR."p = \{p}");
        aList.add(45);
        aList.add(3,7);
        aList.remove(9);
        // aList.removeRange(0,3);

        int howMany = aList.size(); // allocated size
        System.out.println(STR."How Many : \{howMany}");
        // print
        for (int i = 0; i < 21; i++) {
            System.out.println(aList.get(i)); // aList.get(i)
        }
    }
}
