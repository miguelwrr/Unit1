package part2;

import java.util.Scanner;

public class Exersice06 {

	public static void main(String[] args) {

		//Declaration of measure and result variables
		int milimeters;
		int centimeters;
		int meters;
		int result;
		
		//Scanner creation
		Scanner scanner = new Scanner(System.in);
		
		//All measures are asked for
		System.out.print("Introduce milimeters: ");
		milimeters = scanner.nextInt();
		System.out.print("Introduce centimeters: ");
		centimeters = scanner.nextInt();
		System.out.print("Introduce meters: ");
		meters = scanner.nextInt();
		
		//Result is calculated
		result = meters * 100 + centimeters + milimeters / 10;
		
		//Output message
		System.out.printf("%d milimeters, %d centimeters and %d meters add up to a total of %d centimeters.", milimeters, centimeters, meters, result);
		
		//Scanner closed
		scanner.close();

	}

}
