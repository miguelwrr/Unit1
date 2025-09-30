package part2;

import java.util.Scanner;

public class Exersice08 {

	public static void main(String[] args) {
		
		//Declaration of meters and result variables
		double meters;
		int result;
		
		//Scanner creation
		Scanner scanner = new Scanner(System.in);
		
		//Meters are asked for
		System.out.print("Introduce meters: ");
		meters = scanner.nextDouble();
		
		//Result is calculated
		result = (int) (meters*100);
		
		//Output message
		System.out.printf("Result: %d cm.", result);
		
		//Scanner closed
		scanner.close();

	}

}
