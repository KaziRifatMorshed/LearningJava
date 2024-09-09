package DataStracture.Array;

/*
C-3.18
Let B be an array of size n ≥ 6 containing integers from 1 to n − 5 inclusive, five
of which are repeated. Describe an algorithm for finding the five integers in B
that are repeated.
 */

import java.util.Arrays;

public class Find_five_repeated_in_Array {
    private static int search_repeated_int(int[] data) {
        int[][] frequency = new int[data.length][2];
        for (int i : data) {
            for (int j = i + 1; j < data.length; j++) { // search first
                if (data[j] == data[i]) { // found
                    return j;
                }
            }
        }
        return -1; // -1 is not a valid index, this will be returned when we do not found the desired one in the array
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5};
        System.out.println(search_repeated_int(arr));
        System.out.println(Arrays.toString(arr));
    }
}
