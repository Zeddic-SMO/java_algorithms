// Given an integer N i.e the size of the input, followed by N more integers, find the largest of these N numbers
// Sample Input
// 5
// 10 -3 2 12 7

// sample output
// 12
import java.util.Scanner;

class largets_of_N_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(largestOfN(n));
        sc.close();

    }

    public static int largestOfN(int size) {
        Scanner scanner = new Scanner(System.in);
        int maxNum = 0;
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            if (num > maxNum) {
                maxNum = num;
            }
        }
        scanner.close();
        return maxNum;
    }

    public static int largestOfNOption(int size, Scanner scanner) {
        int maxNum = Integer.MIN_VALUE; // Initialize maxNum to the smallest possible integer
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            maxNum = Math.max(maxNum, num); // Using Math.max() function to return the highest value between maxNum and
                                            // num
        }
        return maxNum;
    }

}
