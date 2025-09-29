package part2;

import java.util.Scanner;

public class Exersice08 {

	public static void main(String[] args) {
		
		double meters;
		
		int result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce meters: ");
		meters = scanner.nextDouble();
		
		result = (int) (meters*100);
		
		System.out.printf("Result: %d cm.", result);
		
		
		
		scanner.close();

	}

}
