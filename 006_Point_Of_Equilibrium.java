/**
 * Consider an array A with n of positive integers.
 * An integer idx is called a POE (point of equilibrium) of A, if A[0] + A[1] +
 * … + A[idx – 1] is equal to A[idx + 1] + A[idx + 2] + … + A[n – 1].
 * Write a function to return POE of an array, if it exists and -1 otherwise.
 * The signature of the function is:
 * int f(int[] a)
 */

class Point_Of_Equilibrium {
    public static int f(int[] a) {
        if (a == null || a.length < 3)
            return -1; // edge case - array is too small to have a POE

        int leftSumPointer = 0;
        int rightSumPointer = a.length - 1;

        int assumedPOEIdx = 1;

        int leftSum = a[leftSumPointer];
        int rightSum = a[rightSumPointer];

        for (int i = 1; i < a.length - 2; i++) { // excluding the 2 elements - the first and the last element
            if (leftSum < rightSum) {
                leftSumPointer++;
                leftSum += a[leftSumPointer];
                assumedPOEIdx = leftSumPointer + 1;
            } else {
                rightSumPointer--;
                rightSum += a[rightSumPointer];
                assumedPOEIdx = rightSumPointer - 1;

            }

        }
        return leftSum == rightSum ? assumedPOEIdx : -1;

    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 6 };
        int result = f(array);

        System.out.println("Point of Equilibrium: " + result); 
    }
}
