//  Given a matrix, print it coumn by column

// sample Input
// 1 2 3
// 4 5 6

// sample output
// 1 4
// 2 5
// 3 6

class Column_Wise_print {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

}
