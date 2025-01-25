// You need to write a divider program which will operate with integers,
// The program you are given should take two integers as input and execute the
// division, but we need to handle two exceptions:
// 1. the divider shouldn't be zero
// 2. both inputs should be integers.
// Complete the program to handle them. For the first exception, the program
// should output "Mistake: division by zero"; and for the second one, "Mistake:
// wrong value type".

// Sample Input
// 1
// b

// Sample Output
// Mistake: wrong value type

// Note: Use ArithmeticException for first exception and InputMismatchException
// for the second one.

import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();

			if (num2 == 0) {
				throw new ArithmeticException();
			} else if (num1 < 0 || num2 < 0) {
				throw new InputMismatchException();
			} else {
				System.out.println(num1 / num2);
			}

		} catch (ArithmeticException error) {
			System.out.println("Mistake: division by zero");

		} catch (InputMismatchException error) {
			System.out.println("Mistake: wrong value type");
		} finally {
			scanner.close();
		}
	}
}