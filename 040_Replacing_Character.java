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
