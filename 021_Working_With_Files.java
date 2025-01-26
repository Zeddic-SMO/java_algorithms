// You want to plan your day and create your to do list.
// Complete the program to take the names of 3 tasks as input and write them down in the file "tasks.txt", each on a new line.
// Then use the readFile() method to output the tasks.

// Sample Code
// Workout
// Report
// Pool

// Sample Output
// Workout
// Report
// Pool

// Add \n to the end of each line to create a new line.
import java.util.*;
import java.io.*;

class Working_With_Files {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Formatter f = new Formatter("tasks.txt");
            int count = 0;
            while (count < 3) {
                // your code goes here
                String task = input.nextLine();
                f.format("%s", task);
                count++;
            }
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        readFile();
        input.close();
    }

    public static void readFile() {
        try {
            File x = new File("tasks.txt");
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
