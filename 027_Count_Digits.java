//  Given an integer N, count and print its number of digits
//  Example: N = 12345, output: 5

import java.util.*;

class Count_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int digits = 0;
        while (N > 0) {
            N /= 10;
            digits++;
        }
        System.out.println(digits);
        scanner.close();

    }

}
