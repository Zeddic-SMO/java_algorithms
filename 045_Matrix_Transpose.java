// Given a 2D integer array A, return the transpose of A.

// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

// Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
//  we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].

class Matrix_Transpose {
    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int rows = A.length;
        int cols = A[0].length;

        int[][] B = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[j][i] = A[i][j];
            }
        }

        // print transpose
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

    }

}
