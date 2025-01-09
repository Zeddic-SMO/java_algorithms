/**
 * Write a function to return an array containing all elements common to two
 * given arrays containing distinct positive integers. You should not use any
 * inbuilt methods. You are allowed to use any number of arrays.
 * The signature of the function is:
 * int[] f(int[] first, int[] second)
 */

class CommonElements {

    public static int[] f(int[] first, int[] second) {
        if (first == null || second == null)
            return new int[0];
        ;
        if (first.length == 0 || second.length == 0)
            return new int[0];

        // Find the maxsize of the common elements array
        int maxsize = 0;
        if (first.length > second.length) {
            maxsize = first.length;
        } else {
            maxsize = second.length;
        }

        // Common elements array
        int[] common = new int[maxsize];
        int commonIndex = 0;

        for (int f = 0; f < first.length; f++) {
            for (int s = 0; s < second.length; s++) {
                if (first[f] == second[s]) {
                    // Check if the common element is already in the common array
                    boolean isCommon = false;
                    for (int i = 0; i < commonIndex; i++) {
                        if (common[i] == first[f]) {
                            isCommon = true;
                            break;
                        }
                    }
                    if (!isCommon) {
                        common[commonIndex] = first[f];
                        commonIndex++;
                    }

                }
            }
        }
        // Copy the valid part of the result array into a new array of the correct size
        int[] finalResult = new int[commonIndex];
        for (int i = 0; i < commonIndex; i++) {
            finalResult[i] = common[i];
        }

        return finalResult;

    }

    public static void main(String[] args) {
        int[] first = { 1, 2, 3, 4, 5 };
        int[] second = { 3, 4, 5, 6, 7 };

        int[] common = f(first, second);

        // Print the result
        System.out.print("Common Elements: ");
        for (int num : common) {
            System.out.print(num + " ");
        }

    }
}
