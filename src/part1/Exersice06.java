package part1;

import java.util.Scanner;

public class Exersice06 {

	public static void main(String[] args) {

		//Variables are declared
		int num1;
		int num2;
		
		//Scanner object is declared
		Scanner scanner = new Scanner(System.in);
		
		//User is asked for the first numer
		System.out.print("Introduce the first number: ");
		num1 = scanner.nextInt();
		
		//User is asked for the second number
		System.out.print("Introduce the second number: ");
		num2 = scanner.nextInt();
		//All operations are printed
		System.out.println("Addition: " + (num1 + num2));
		System.out.println("Subtraction: " + (num1 - num2));
		System.out.println("Multiplication: " + (num1 * num2));
		System.out.println("Division: " + ((double) num1 / num2));
		
		//Scanner is closed
		scanner.close();

	}

}
