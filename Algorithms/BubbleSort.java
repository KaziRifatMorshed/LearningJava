package Algorithms;

class BubbleSort {

    static void Bubble_Sort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    static void main(String[] args) {
        int[] arr = {9, 1, 7, -5, 3, 4, 19, 4, 0};
        Bubble_Sort(arr);
        System.out.println(arr);
    }

}
