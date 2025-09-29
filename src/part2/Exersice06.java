package part2;

import java.util.Scanner;

public class Exersice06 {

	public static void main(String[] args) {

		int milimeters;
		int centimeters;
		int meters;
		int sum;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce milimeters: ");
		milimeters = scanner.nextInt();
		System.out.print("Introduce centimeters: ");
		centimeters = scanner.nextInt();
		System.out.print("Introduce meters: ");
		meters = scanner.nextInt();
		
		sum = meters * 100 + centimeters + milimeters / 10;
		
		System.out.printf("%d milimeters, %d centimeters and %d meters add up to a total of %d centimeters.", milimeters, centimeters, meters, sum);
		
		scanner.close();

	}

}
