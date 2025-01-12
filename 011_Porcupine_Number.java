/**
 * A prime number is an integer that is divisible only by 1 and itself. A
 * porcupine number is a prime number whose last digit is 9 and the next prime
 * number that follows it also ends with the digit 9. For example 139 is a
 * porcupine number because:
 * a. it is prime
 * b. it ends in a 9
 * c. The next prime number after it is 149 which also ends in 9. Note that 140,
 * 141, 142, 143, 144, 145, 146, 147 and 148 are not prime so 149 is the next
 * prime number after 139.
 * Write a method named findPorcupineNumber which takes an integer argument n
 * and returns the first porcupine number that is greater than n. So
 * findPorcupineNumber(0) would return 139 (because 139 happens to be the first
 * porcupine number) and so would findPorcupineNumber(138). But
 * findPorcupineNumber(139) would return 409 which is the second porcupine
 * number.
 * The function signature is
 * int findPorcupineNumber(int n)
 * You may assume that a porcupine number greater than n exists.
 * You may assume that a function isPrime exists that returns 1 if its argument
 * is prime, otherwise it returns 0. E.G., isPrime(7) returns 1 and isPrime(8)
 * returns 0.
 * Hint: Use modulo base 10 arithmetic to get last digit of a number.
 */

class Porcupine_Number {

    // Helper function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false; // Numbers <= 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false; // Divisible by another number
        }
        return true;
    }

    // Function to find the first porcupine number greater than n
    public static int findPorcupineNumber(int n) {
        int num = n + 1;

        while (true) {
            // Check if the current number is prime and ends in 9
            if (isPrime(num) && num % 10 == 9) {
                // Find the next prime number
                int next = num + 1;
                while (!isPrime(next)) {
                    next++;
                }
                // Check if the next prime ends in 9
                if (next % 10 == 9) {
                    return num;
                }
            }
            num++; // Increment and continue searching
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(findPorcupineNumber(0)); // Output: 139
        System.out.println(findPorcupineNumber(138)); // Output: 139
        System.out.println(findPorcupineNumber(139)); // Output: 409
    }

}
