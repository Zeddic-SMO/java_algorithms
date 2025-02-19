// Given two matrices of same sizes, print their sum.

import java.util.*;

class Sum_Of_Two_2D_Array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] sumArr = new int[rows][cols];

        // for a array
        matrixRead(a);

        // for b array
        matrixRead(b);

        // Sum of two arrays
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumArr[i][j] = a[i][j] + b[i][j];
            }
        }

        // print sum array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumArr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    static void matrixRead(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

}