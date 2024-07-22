package Algorithms;

public class BinarySearch_again {

    static boolean BinarySearch(int[] a, int key, int start, int end) {
        int mid = (start + end) / 2;
        if (key < a[mid]){

        }

            return false;
    }

    static void main(String[] args) {
        int[] arr = {-5, 0, 1, 3, 4, 5, 7, 9, 19};
        boolean is_found = BinarySearch(arr, 9, 0, arr.length);
        System.out.println(is_found);
    }
}
