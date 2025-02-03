// Problem Description - 

// Given the height (A) and weight (B) of a person as input in centimetres and kilograms.

// Find the BMI of that person and the classification of the user based on their BMI.

// Print Underweight if BMI < 18.5
// Print Normal if BMI lies in the range [18.5, 24.9]
// Print Overweight if BMI lies in the range (24.9, 29.9]
// Print Obese if BMI is greater than 29.9
// If x is the weight in kilograms and y is the height in metres.

// Then, BMI is calculated as x/(y*y).

//  Note: Use round(BMI,1) to get only one digit after decimal

// Problem Constraints -

// 1 <= A <= 180

// 1 <= B <= 120

// Input Format -

// The first line contains the height of the person in centimetres.

// The second line of the input contains the weight of the person in kilograms.

// Output Format -

// The first line of the output contains the classification of a person based on the BMI value.

// The second line of the output contains the BMI value of the person having only one digit after decimal.

// Sample Input - 

// Input 1:

// 101
// 29
// Input 2:

// 129
// 31
// Sample Output -

// Output 1:

// Overweight
// 28.4
// Output 2:

// Normal
// 18.6
import java.util.*;

class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heightCm = sc.nextInt();
        int weightKg = sc.nextInt();
        sc.close();

        // Convert height to meters
        double heightM = heightCm / 100.0;

        // Calculate BMI
        double bmi = weightKg / (heightM * heightM);

        // Round BMI to 1 decimal place
        String formattedBmi = String.format("%.1f", bmi);

        // Determine BMI category
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi > 24.9 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        // Print BMI
        System.out.println(formattedBmi);
    }
}
