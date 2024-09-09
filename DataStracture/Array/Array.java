package DataStracture.Array;

import java.util.Arrays;

class Learning_one_dimension_array {
    private int[] one_dimension_array;

    public Learning_one_dimension_array(int n) {
        this.one_dimension_array = new int[n];
    }

    void use_sample_array() {
//        new Learning_one_dimension_array(9);
        this.one_dimension_array = new int[]{12, 45, 56, 88, 12, 45, 36, 25, 84};
    }

    int getLength() {
        return this.one_dimension_array.length;
    }

    void print_arr() {
        System.out.println(Arrays.toString(this.one_dimension_array));
    }

    public static void main(String[] args) {
        Learning_one_dimension_array array = new Learning_one_dimension_array(9);
        array.use_sample_array();
        array.print_arr();
    }
}

// =====================================================================================================================

class Learning_two_dimension_array {
    private int[][] two_dimension_array;

    Learning_two_dimension_array(int n, int m) {
        this.two_dimension_array = new int[n][m];
    }

    void use_sample_array() {
        this.two_dimension_array = new int[][]{{12, 45, 56}, {88, 12, 45}, {36, 25, 84}};
    }

    void print_arr() {
        System.out.println(Arrays.deepToString(this.two_dimension_array));
    }

    int getLength() {
        return this.two_dimension_array.length;
    }

    int calculate_sum_of_diagonal_elements() {
        int sum = 0;
        for (int i = 0; i < this.two_dimension_array.length; i++) {
            for (int j = 0; j < this.two_dimension_array[0].length; j++) {
                if (i == j || (this.two_dimension_array.length - 1) == (i + j)) {
                    sum += this.two_dimension_array[i][j];
                }
            }
        }
        return sum;
    } // DONE


    public static void main(String[] args) {
        Learning_two_dimension_array array = new Learning_two_dimension_array(3, 3);
        array.use_sample_array();
        array.print_arr();
        System.out.println(STR."Sum of diagonal element is = \{array.calculate_sum_of_diagonal_elements()}");
    }
}

// =====================================================================================================================

class Learning_three_dimension_array {
    private int[][][] three_dimension_array;

    Learning_three_dimension_array(int n, int m, int p) {
        this.three_dimension_array = new int[n][m][p];
    }

}
