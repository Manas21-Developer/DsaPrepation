package Array.TwoDMatrix;

class MagicSquare{
    // Function to check Magic Square
    public static boolean magicSquare(int[][] mat) {

        int n = mat.length;

        // Check distinct elements and valid range
        boolean[] seen = new boolean[n * n + 1];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                int val = mat[i][j];

                // Value should be between 1 and n^2
                if (val < 1 || val > n * n) {
                    return false;
                }

                // Duplicate check
                if (seen[val]) {
                    return false;
                }

                seen[val] = true;
            }
        }

        int leftSum = 0;
        int rightSum = 0;

        // Calculate both diagonal sums
        for (int i = 0; i < n; i++) {

            // Primary diagonal
            leftSum += mat[i][i];

            // Secondary diagonal
            rightSum += mat[i][n - 1 - i];
        }

        // Expected sum from first row
        int sum = 0;

        for (int j = 0; j < n; j++) {
            sum += mat[0][j];
        }

        // Check all rows
        for (int i = 0; i < n; i++) {

            int rowSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += mat[i][j];
            }

            if (rowSum != sum) {
                return false;
            }
        }

        // Check all columns
        for (int j = 0; j < n; j++) {

            int colSum = 0;

            for (int i = 0; i < n; i++) {
                colSum += mat[i][j];
            }

            if (colSum != sum) {
                return false;
            }
        }

        // Final diagonal check
        return leftSum == sum && rightSum == sum;
    }

    public static void main(String[] args) {

        int[][] mat = {
                {2, 7, 0},
                {9, 5, 1},
                {4, 3, 8}
        };

        boolean ans = magicSquare(mat);

        System.out.println(ans);
    }
}