// Row & Column Sums
// Problem Description
// You are given a matrix A, you have to return an array containing sum of each row elements followed by sum of each column elements of the matrix.

// NOTE: If the matrix given is of size (N x M), then the array you return would be of size (N + M), where first N elements contain the sum of each N rows, and the next M elements contain the sum of each M columns.

// Problem Constraints
// 1 <= A.size() <= 1000
// 1 <= A[i].size() <= 1000
// 1 <= A[i][j] <= 1000

// Input Format
// First argument is a 2D matrix of integers.
// Output Format

// You have to return a 1D list of integers after doing required operations.

// Example Input

// Input 1:

// A = [[1, 2],[4, 5],[8, 9]]

// Example Output

// Output 1:

// [3, 9, 17, 13, 16]

// Example Explanation

// Explanation 1:

// Row 1 elements sum = 1 + 2 = 3.
// Row 2 elements sum = 4 + 5 = 9.
// Row 3 elements sum = 8 + 9 = 17.
// Column 1 elements sum = 1 + 4 + 8 = 13.
// Column 2 elements sum = 2 + 5 + 9 = 16.

class Rows_Columns_Sums {
    public int[] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;

        int[] result = new int[rows + cols];

        // Calculate row sums
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += A[i][j];
            }
            result[i] = rowSum;
        }

        // Calculate column sums
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += A[i][j];
            }
            result[rows + j] = colSum;
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] A = { { 1, 2 }, { 4, 5 }, { 8, 9 } };
        Rows_Columns_Sums obj = new Rows_Columns_Sums();
        int[] result = obj.solve(A);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}