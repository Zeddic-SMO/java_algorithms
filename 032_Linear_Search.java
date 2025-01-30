// Linear Search
// Given an array and a key value as input, find the index of the key in the
// array.
// Return -1 if it is not present

import java.util.Scanner;

class Linear_Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];

        // Input loop
        for (int i = 0; i < arrLen; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        int ans = -1;
        for (int i = 0; i < arrLen; i++) {
            if (arr[i] == key) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
        sc.close();

    }
}