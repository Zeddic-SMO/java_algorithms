/*
 * Write a function that accepts a character array, a zero-based start position and a length. 
 * It should return a character array containing containing lengthcharacters starting with the startcharacter of the input array. 
 * The function should do error checking on the start position and the length and return null if the either value is not legal.
 * The function signature is:
 * char[ ] f(char[ ] a, int start, int len)
 */

class Character_Array {

    public static char[] f(char[] a, int start, int len) {
        if (start < 0 || start > a.length || len < 0 || len > a.length || len > a.length - start)
            return null;

        char[] result = new char[len];
        for (int i = 0; i < len; i++) {
            result[i] = a[start + i];
        }

        return result;
    }

    public static void main(String[] args) {
        char[] a = { 'a', 'b', 'c' };
        int start = 2;
        int len = 1;
        System.out.println(f(a, start, len));
    }
}
