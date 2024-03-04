package ArrayList;

import java.util.*;

public class ArrayListEmp {
    public static void main(String[] args) {
        // Creating an empty array list
        ArrayList<Emp> list = new ArrayList<Emp>();
        // Adding items to arrayList
        list.add(new Emp(1, "Anis"));
        Emp e2 = new Emp(2, "Liana");
        list.add(e2);
        list.add(new Emp(3, "Alokanonda")); // it will add Item3 to the third position of array list
        list.add(new Emp(4, "Radhika"));
        // Display the contents of the array list
        System.out.println(STR."The arraylist contains the following elements:\n \{list}");
        //Checking index of an item
        int pos = list.indexOf(new Emp("Liana"));
        System.out.println(STR."The index of Liana is: \{pos}");
        //Checking if array list is empty
        boolean check = list.isEmpty();
        System.out.println(STR."Checking if the arraylist is empty: \{check}");
        // Getting the size of the list
        int size = list.size();
        System.out.println(STR."The size of the list is: \{size}");
        // Checking if an element is included to the list
        boolean element = list.contains(new Emp(7));
        System.out.println(STR."Checking if the arraylist contains the object Item5: \{element}");
        // Getting the element in a specific position
        Emp item = list.get(0);
        System.out.println(STR."The item is the index 0 is: \{item}");
        // Retrieve elements from the arraylist
        // 1st way: loop using index and size list
        System.out.println("Retrieving items with loop using index and size list");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(STR."Index: \{i} - Item: \{list.get(i)}");
        }
        // 2nd way:using foreach loop
        System.out.println("Retrieving items using foreach loop");
        for (Emp e : list) {
            System.out.print(e);
        }
        //3rd way:using iterator
        // hasNext(): returns true if there are more elements
        // next(): returns the next element
        System.out.println("\nRetrieving items using iterator");
        //while(it.hasNext()) {
        for (Emp emp : list) {
            System.out.println(STR."Item is: \{emp}");
        }
        // Replacing an element
        list.set(1, new Emp("NewItem1"));
        System.out.println(STR."The arraylist after the replacement is: \{list}");
        pos = list.indexOf(new Emp("NewItem1"));
        list.set(pos, new Emp(2, "Sayem"));
        // Removing items
        // removing the item in index 0
        list.remove(0);
        // removing the first occurrence of item "Item3"
        list.remove(new Emp(3, "Alokanonda"));
        System.out.println(STR."The final contents of the arraylist are: \{list}");
        // Converting ArrayList to Array
        Emp[] simpleArray = list.toArray(new Emp[list.size()]);
        System.out.println(STR."The array created after the conversion of our arraylist is: \{Arrays.toString(simpleArray)}");
    }
}
