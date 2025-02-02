// Given an integer N, generate & print an array containing squares of all numbers from 1 to N

import java.util.Scanner;

class Array_of_Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 1; i <= N; i++) {
            arr[i - 1] = i * i;
        }

        for (int num : arr) {
            System.out.println("Value=" + num);
        }
        sc.close();
    }
}
