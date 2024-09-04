package DataStracture.Array;

class CornerSum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int num_of_rows = matrix.length, num_of_col = matrix[0].length, sum = 0;
        for (int i = 0; i < num_of_rows; i++) {
            for (int j = 0; j < num_of_col; j++) {
                if (i == 0 || j == 0 || i == num_of_rows - 1 || j == num_of_col - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
