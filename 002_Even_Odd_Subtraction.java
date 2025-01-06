/*
 * Write a function that takes an array of integers as an argument and returns a value based on the sums of the even and odd numbers in the array. 
 * Let X = the sum of the odd numbers in the array and let Y = the sum of the even numbers. The function should return X – Y
 * The signature of the function is:
 * int f(int[ ] a)
 */

class Even_Odd_Subtraction {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        System.out.println(f(a));
    }

    static int f(int[] a) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sumEven += a[i];
            } else {
                sumOdd += a[i];
            }
        }

        return sumOdd - sumEven;
    }

}
