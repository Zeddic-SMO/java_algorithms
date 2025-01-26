// The program you are given declares LinkedList "words".
// Write a program to take words as input and add them to LinkedList untill its
// size isn't equal to 5, then output only those words whose length is more than
// 4 characters.

// Sample Input
// Java
// practice
// is
// makes
// perfect

// Sample Output
// practice
// makes
// perfect

// length() method returns the number of characters in a string.

import java.util.LinkedList;
import java.util.Scanner;

class LinkedLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> words = new LinkedList<String>();

        while (words.size() < 5) {
            String word = scanner.nextLine();
            // add the word to LinkedList
            words.add(word);

        }

        // your code goes here
        for (String w : words) {
            if (w.length() > 4) {
                System.out.println(w);
            }
        }

        scanner.close();

    }

}