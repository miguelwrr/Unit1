package unit1;

import java.util.Scanner;

public class Exersice11 {

	public static void main(String[] args) {

		// pesetas variable
		int pesetas;

		// euros variable
		double euros;

		// Scanner object is created
		Scanner scanner = new Scanner(System.in);

		// Qty of pesetas to convert
		System.out.print("Introduce the value in pesetas to convert to euros: ");
		pesetas = scanner.nextInt();

		// Conversion is calculated
		euros = pesetas * 1.0 / 166;

		// Conversion is printed
		System.out.printf("%d pesetas are worth %f euros", pesetas, euros);

		scanner.close();

	}

}
