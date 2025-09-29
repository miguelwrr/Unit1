package part1;

import java.util.Scanner;

public class Exersice09 {

	public static void main(String[] args) {

		// age variable
		int age;

		// overage variable
		boolean overage;

		// Scanner object is created
		Scanner scanner = new Scanner(System.in);

		// User is asked for their age
		System.out.print("Introduce your age: ");
		age = scanner.nextInt();

		// Overage is set to true or false depending on user's age
		overage = age >= 18;

		// Message is printed out
//		if (overage) {
//			System.out.println("You are overage.");
//		} else {
//			System.out.println("You are a minor.");
//		}
		System.out.println((overage) ? "You are overage" : "You are a minor");
		
		// Scanner is closed
		scanner.close();

	}

}
