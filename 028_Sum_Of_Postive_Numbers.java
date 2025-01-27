// Given a stream of numbers, read the numbers till you read a -ve integer and print the sum of numbers read so far

// Sample input
// 5 3 2 -4 2 0 9 ....
// Sample output
// 6
import java.util.*;

class Sum_Of_Postive_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            num = sc.nextInt();
            sum += num;

        } while (num >= 0);
        System.out.println("Sum = " + sum);
    }
}
