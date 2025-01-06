/*
 * An array with an odd number of elements is said to be centered if all
 * elements (except the middle one) are strictly greater than the value of the
 * middle element. Note that only arrays with an odd number of elements have a
 * middle element. Write a function that accepts an integer array and returns 1
 * if it is a centered array, otherwise it returns 0.
 */

class Centered_Array {
    public static void main(String[] args) {
        int result = centeredArrChck(new int[] { 1, 2, 3, 4, 5 });
        System.out.println(result);
    }

    static int centeredArrChck(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length % 2 == 0) {
            return 0;
        }

        int middleIdx = arr.length / 2;

        int middleNum = arr[middleIdx];
        for (int i = 0; i < arr.length; i++) {
            if (i != middleIdx && middleNum >= arr[i]) {
                return 0;
            }
        }
        return 1;

    }
}