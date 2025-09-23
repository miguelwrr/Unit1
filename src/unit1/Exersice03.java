package unit1;

import java.util.Scanner;

public class Exersice03 {

	public static void main(String[] args) {
		//currentYear variable
		int currentYear;

		//birthYear variable
		int birthYear;
		
		//age variable
		int age;
		
		//Scanner object is created
		Scanner scanner = new Scanner(System.in);
		
		//User is asked for the current year
		System.out.print("What year is it now?: ");
		currentYear = scanner.nextInt();
		
		//User is asked for their birth year
		System.out.print("And what year were you born?: ");
		birthYear = scanner.nextInt();
		
		
		//age is calculated
		age = currentYear - birthYear;
		
		//User is told their age
		System.out.println("You are " + age + " or " + (age -1) + ", depending on when your birthday is.");
		
		
		//Scanner is closed
		scanner.close();

	}

}
