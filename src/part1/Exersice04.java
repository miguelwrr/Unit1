package part1;

import java.util.Scanner;

public class Exersice04 {

	public static void main(String[] args) {

		//grade1 variable
		int grade1;
		
		//grade2 variable
		int grade2;
		
		//average variable 
		double avg;
		
		//Scanner object is created
		Scanner scanner = new Scanner(System.in);
		
		//User is asked for their 1st grade
		System.out.print("Introduce your first grade: ");
		grade1 = scanner.nextInt();
		
		//User is asked for their 2nd grade
		System.out.print("Introduce your second grade: ");
		grade2 = scanner.nextInt();
		
		//Average is calculated
		avg = (grade1 + grade2) / 2;
		
		//Average is printed
		System.out.println("Your final grade is " + avg + ".");

		//Scanner is closed
		scanner.close();
	}

}
