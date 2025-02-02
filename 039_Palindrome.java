// Given a string, check whether it is a palindrome.
// Sample input
// Input: "madam", "tenet"
// Output: True

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // generate the reverse string
        String reverse = new StringBuilder(str).reverse().toString();

        if (str.equals(reverse)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}
