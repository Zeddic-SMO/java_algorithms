// Problem Description

// Write a program to find the difference between the sum of all even elements and the sum of all odd elements from the given array, A.
// Note: The array of elements will be passed as an argument to the function. You don't need to take any input of array.

// Problem Constraints
// 1 <= len(A) <= 105
// 1 <= A[i] <= 105

// Input Format
// The only argument is the array of integers, A.

// Output Format
// The difference of the even and odd elements sum in integer format.

// Example Input
// Input 1:
// 1
// 56 63 87 24 32 13 15 19 44 52
// Input 2:
// 1
// 2 8 4 6

// Example Output
// Output 1:
// 11
// Output 2:
// 20

class Diff_Even_Odd {
    public static void main(String[] args) {
        int[] A = new int[] { 56, 63, 87, 24, 32, 13, 15, 19, 44, 52 };

        int sumEven = 0;
        int sumOdd = 0;

        for (int num : A) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        int diff = sumEven - sumOdd;
        System.out.println("Difference between Even Sum and Odd sum  = " + diff);
    }

}
