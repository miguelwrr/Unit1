package part1;

import java.util.Scanner;

public class Exersice10 {

	public static void main(String[] args) {

		// number variable
		int number;

		// isEven variable
		boolean isEven;

		// Scanner object is created
		Scanner scanner = new Scanner(System.in);

		// User is asked for a number
		System.out.print("Introduce a number: ");
		number = scanner.nextInt();

		// It is determined whether the number is even or odd
		isEven = number % 2 == 0;

		// Message is printed
		System.out.printf("The number %d is %s", number, isEven ? "even." : "odd.");

//		// 'even' or 'odd' is printed
//		if (isEven) {
//			System.out.print("even.");
//		} else {
//			System.out.print("odd.");
//		}

		// Scanner is closed.
		scanner.close();
	}

}
