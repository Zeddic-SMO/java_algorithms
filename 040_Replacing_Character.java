// Write a program to return a string from a given string s where all occurrences of 
// the first char of the string except the first occurrence have been changed to '$'.
// Sample Input:

// "restart"
// Sample Output:

// "resta$t"
// Sample Explanation:

// ‘r’ is the first character of the string. We have to replace all the occurrences of r to ‘$’
//  except the one at index 0.


import java.util.*;

class Replacing_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String givenString = sc.next();

        char firstChar = givenString.charAt(0);

        String newString = firstChar + "";
        for (int i = 1; i < givenString.length(); i++) {
            if (givenString.charAt(i) == firstChar) {
                newString += "$";
            } else {
                newString += givenString.charAt(i);
            }
        }

        System.out.println(newString);
        sc.close();
    }
}
