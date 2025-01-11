/**
 * A Madhav array has the following property.
 * a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
 * The length of a Madhav array must be n*(n+1)/2 for some n.
 * Write a method named isMadhavArray that returns 1 if its array argument is a
 * Madhav array, otherwise it returns 0.
 * If you are programming in Java or C# the function signature is
 * int isMadhavArray(int[ ] a)
 * If you are programming in C or C++, the function signature is
 * int isMadhavArray(int a[ ], int len)
 * where len is the number of elements in
 * a.
 */

class Madhav_Array {
    public static int isMadhavArray(int[] a) {
        int length = a.length;

        // 1. Check the Length Condition - n*(n+1)/2 for some n.
        int n = 1;
        while (n * (n + 1) / 2 < length) {
            n++;
        }
        if (n * (n + 1) / 2 != length) {
            return 0;
        }

        // 2. check the sum condition - a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] +
        // a[7] + a[8] + a[9] = ...
        int startIndex = 0;
        for (int groupLen = 1; startIndex < length; groupLen++) {
            int sum = 0;
            for (int i = 0; i < groupLen && startIndex < length; i++) {
                sum += a[startIndex++];
            }

            if (sum != a[0]) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[] { 2, 1, 1 }));
        System.out.println(isMadhavArray(new int[] { 2, 1, 1, 4, -1, -1 }));
        System.out.println(isMadhavArray(new int[] { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 }));
        System.out.println(isMadhavArray(new int[] { 18, 9, 10, 6, 6, 6 }));
        System.out.println(isMadhavArray(new int[] { -6, -3, -3, 8, -5, -4 }));
        System.out.println(isMadhavArray(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1 }));
        System.out.println(isMadhavArray(new int[] { 3, 1, 2, 3, 0 }));
    }
}
