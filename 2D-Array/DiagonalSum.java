class DiagonalSum {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            // Primary Sum
            sum += matrix[i][i];

            // Secondary Sum
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        System.out.println(sum);

    }
}