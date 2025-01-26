// The program you are given declares ArrayList of integers.
// Complete the program to take numbers as input and add them to ArrayList until its size isn't equal to 5. Then output its maximum and minimum values.

// Sample Input
// 4
// 12
// 3
// 88
// 96

// Sample Output
// 96
// 3

// Use Collections.max() and Collections.min() to get the maximum and the minimum.
import java.util.*;

class Sorting_Lists {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        while (nums.size() < 5) {
            int num = scanner.nextInt();

            nums.add(num);

        }

        scanner.close();

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("Maximun num = " +  max);
        System.out.println("Minimium num = " + min);

    }
}
