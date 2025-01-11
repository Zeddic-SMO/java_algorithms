/**
 * An array is defined to be inertial if the following conditions hold:
 * a. it contains at least one odd value
 * b. the maximum value in the array is even
 * c. every odd value is greater than every even value that is not the maximum
 * value. So {11, 4, 20, 9, 2, 8} is inertial because
 * a. it contains at least one odd value
 * b. the maximum value in the array is 20 which is even
 * c. the two odd values (11 and 9) are greater than all the
 * even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}.
 * However, {12, 11, 4, 9, 2, 3, 10} is not inertial because it fails condition
 * (c), i.e., 10 (which is even) is greater 9 (which is odd) but 10 is not the
 * maximum value in the array.
 * Write a function called isIntertial that accepts an integer array and returns
 * 1 if the array is inertial; otherwise it returns 0.
 * If you are programming in Java or C#, the function signature is
 * int isInertial(int[ ] a
 * If you are programming in C or C++, the function signature is
 * int isInertial(int a[ ], int len) where len is the number of elements in the
 * array
 */

class Inertial_Array {
    public static int isInertial(int[] a) {
        // Array validation
        if (a.length == 0 || a.length == 1) {
            return 0;
        }

        // edge cases
        // 1. it contains at least one odd value
        boolean hasOdd = false;
        for (int element : a) {
            if (element % 2 != 0) {
                hasOdd = true;
            }
        }
        if (!hasOdd)
            return 0;

        // 2. the maximum value in the array is even
        int maxValue = 0;
        for (int element : a) {
            if (element > maxValue) {
                maxValue = element;
            }
        }
        if (maxValue % 2 != 0) {
            return 0;
        }

        // 3. every odd value is greater than every even value that is not the
        // maximum value
        for (int element : a) {
            if (element % 2 != 0) {
                for (int other : a) {
                    if (other % 2 == 0 && other != maxValue) {
                        if (other > element) {
                            return 0;
                        }
                    }
                }
            }
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(isInertial(new int[] { 1 }));
        System.out.println(isInertial(new int[] { 2 }));
        System.out.println(isInertial(new int[] { 1, 2, 3, 4 }));
        System.out.println(isInertial(new int[] { 1, 1, 1, 1, 1, 1, 2 }));
        System.out.println(isInertial(new int[] { 2, 12, 4, 6, 8, 11 }));
        System.out.println(isInertial(new int[] { 2, 12, 12, 4, 6, 8, 11 }));
        System.out.println(isInertial(new int[] { -2, -4, -6, -8, -11 }));
        System.out.println(isInertial(new int[] { 2, 3, 5, 7 }));
        System.out.println(isInertial(new int[] { 2, 4, 6, 8, 10 }));
    }

}
