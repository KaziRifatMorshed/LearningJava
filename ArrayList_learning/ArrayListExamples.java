package ArrayList_learning;

import java.util.*;

public class ArrayListExamples {
    public static void main(String[] args) {
        // Creating an empty array list
        ArrayList<String> list = new ArrayList<String>();

        // Adding items to arrayList
        list.add("Item1");
        String p = "Item p";
        list.add(p);
        list.add("Item2");
        list.add(2, "Item3"); // it will add Item3 to the third position of array list
        list.add("Item4");

        // Display the contents of the array list
        System.out.println(STR."The arraylist contains the following elements: \{list}\n");

        // Checking index of an item
        int pos = list.indexOf("Item2");
        System.out.println(STR."The index of Item2 is: \{pos}");

        // Checking if array list is empty
        boolean check = list.isEmpty();
        System.out.println(STR."Checking if the arraylist is empty: \{check}");

        // Getting the size of the list
        int size = list.size();
        System.out.println(STR."The size of the list is: \{size}");

        // Checking if an element is included to the list
        boolean element = list.contains("Item5");
        System.out.println(STR."Checking if the arraylist contains the object Item5: \{element}");

        // Getting the element in a specific position
        String item = list.getFirst();
        System.out.println(STR."The item on index 0 is: \{item}\n");


        // Retrieve elements from the arraylist
        // 1st way: loop using index and size list
        System.out.println("Retrieving items with loop using index and size list");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(STR."Index: \{i} -> Item: \{list.get(i)}");
        }
        // 2nd way:using for-each loop
        System.out.println("Retrieving items using foreach loop");
        for (String str : list) { // for each string (FOR ANY STRING str) in the 'list'
            System.out.println(STR."Item is: \{str}");
        }
        // 3rd way:using iterator
        // hasNext(): returns true if there are more elements
        // next(): returns the next element
        System.out.println("Retrieving items using iterator");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(STR."Item is: \{it.next()}");
        }
//        Iterator<String> mama = list.iterator();
//        while (mama.hasNext()){
//            System.out.println(STR."Item is \{mama.next()}");
//        }

        System.out.println();

        // Replacing an element
        list.set(1, "NewItem");
        System.out.println(STR."The arraylist after the replacement is: \{list}");

        // Removing items
        // removing the item in index 0
        list.removeFirst();
        list.remove(1);

        // removing the "first occurrence" of item "Item3"
        list.remove("Item3");
        System.out.println(STR."The final contents of the arraylist are: \{list}");

        // Converting ArrayList to Array
        String[] simpleArray = list.toArray(new String[list.size()]);
        System.out.println(STR."The array created after the conversion of our arraylist is: \{Arrays.toString(simpleArray)}");
    }
}
