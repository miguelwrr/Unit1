package part2;

import java.util.Scanner;

public class Exersice03 {

	public static void main(String[] args) {
		
		//Numbers to input
		int num1;
		int num2;
		//How much to add until num2
		int toNum2;
		
		//Scanner object creation
		Scanner scanner = new Scanner(System.in);
		
		//Input number
		System.out.print("Introduce number: ");
		num1 = scanner.nextInt();
		
		System.out.print("Introduce second number: ");
		num2 = scanner.nextInt();
		
		//How much to add until num2 calculated
		toNum2 = (num1 % num2 == 0) ? 0 : num2 - num1 % num2;
	
		
		//Output message
		System.out.printf("You have to add %d to %d for it to be a multiple of %d.", toNum2, num1, num2);
		
		//Scanner closed
		scanner.close();

	}

}
