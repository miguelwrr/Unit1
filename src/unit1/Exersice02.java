package unit1;

import java.util.Scanner;

public class Exersice02 {
	
	public static void main(String[] args) {
		
		//Variable is declared
		int age;
		
		//Scanner object is created
		Scanner scanner = new Scanner(System.in);
		
		//User is asked for their age
		System.out.print("Please introduce your age: ");
		age = scanner.nextInt();
		
		//Age plus 1 is printed along with the text
		System.out.println("Next year you will be " + (age + 1) + ".");
		
		//Scanner is closed
		scanner.close();
		
		
	}

}
