package part2;

import java.util.Scanner;

public class Exersice02 {

	public static void main(String[] args) {
		
		//Number to input
		int num;
		//How much to add until 7
		int toSeven;
		
		//Scanner object creation
		Scanner scanner = new Scanner(System.in);
		
		//Input number
		System.out.print("Introduce number: ");
		num = scanner.nextInt();
		
		//How much to add until seven calculated
		toSeven = (num % 7 == 0) ? 0 : 7 - num % 7;
	
		
		//Output message
		System.out.printf("You have to add %d to %d for it to be a multiple of 7.", toSeven, num);
		
		//Scanner closed
		scanner.close();

	}

}
