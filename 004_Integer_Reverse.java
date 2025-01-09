/*
 * Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.
 * The signature of the function is:
 * int f(int n)
 */

class Integer_Reverse {
    public static int f(int n) {
        if (n == 0)
            return n;

        int sign = 1;
        if (n < 0) {
            sign = -1;
            n = n * -1;
        }

        int reversed = 0;
        while (n != 0) {
            reversed = (reversed * 10) + (n % 10);
            n = n / 10;
        }

        return sign * reversed;

    }

    public static void main(String[] args) {
        System.out.println(f(12345));
    }
}