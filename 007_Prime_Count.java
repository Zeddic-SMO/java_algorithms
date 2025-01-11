/*
 * Write a function named primeCount with signature
 * int primeCount(int start, int end);
 * The function returns the number of primes between start and end inclusive. Recall that a prime is a positive integer greater than 1 whose only integer factors are 1 and itself.
 */

class Prime_Count {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int primeCount(int start, int end) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int start = 1;
        int end = 1;
        System.out.println(primeCount(start, end));

    }
}