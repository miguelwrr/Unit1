package unit1;

import java.util.Scanner;

public class Exersice01 {

	public static void main(String[] args) {
		
		//Variable is declared
		int number;
		
		//Scanner object is created
		Scanner scanner = new Scanner(System.in);
		
		//User is asked for an integer
		System.out.print("Please, type a number: ");
		number = scanner.nextInt();
		
		//Integer is printed out
		System.out.println("Number introduced: " + number);		
		
		//Scanner is closed
		scanner.close();
		
		

	}

}
