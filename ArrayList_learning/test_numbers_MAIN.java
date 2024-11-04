package ArrayList_learning;

import java.util.*;

// author KAZI RIFAT 230220
public class test_numbers_MAIN {
    public static void main(String[] args) {
        ArrayList<Integer> myInt = new ArrayList<>(25);
        System.out.println(STR."Size of myInt arrayList is \{myInt.size()}");
        for (int k = 0; k < 10; k++) {
            myInt.add(3 * k);
        }
        myInt.set(6, 44);
        myInt.add(4, -22);
        myInt.add(99);


        System.out.println(STR."Size of myInt arrayList is \{myInt.size()}");
        for (Integer i : myInt) System.out.print(STR."\{i}  ");

        myInt.remove(new Integer(99)); // CAREFUL
        myInt.remove(1); // index

        System.out.println();
        System.out.println(STR."Size of myInt arrayList is \{myInt.size()}");
        for (Integer i : myInt) System.out.print(STR."\{i}  ");

        if (myInt.contains(9)) {
            System.out.println("\n9 found");
        }
        System.out.println(STR."15 found at index \{myInt.indexOf(15)}");

    }
}
