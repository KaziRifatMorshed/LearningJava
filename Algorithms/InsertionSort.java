package Algorithms;

import java.util.Arrays;

public class InsertionSort {
    static void main(String[] args) {
//        int[] data = new int[]{-5, 20, 3, 9, 4, -4, 7, 2, 0, 45, 5, 8, 14, 5, 8, 4, 52};
        int[] data = new int[]{-5, 9999, 20, 3, 0, 9, 4, -4, -999};
        System.out.println(STR."Before = \{Arrays.toString(data)}");
        insertionSort(data);
        System.out.println(STR."After = \{Arrays.toString(data)}");
    }

    private static void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    private static void insertionSort(int[] data) {
        for (int pick_one = 1; pick_one < data.length; pick_one++) {
            int perfect_location = -1, back_tracker;
            for (back_tracker = pick_one - 1; back_tracker >= 0; back_tracker--) {
                if (data[pick_one] < data[back_tracker]) {
                    perfect_location = back_tracker;
                }
            }
            if (perfect_location != -1) {
                swap(data, pick_one, perfect_location);
            }
        }
    }
}
