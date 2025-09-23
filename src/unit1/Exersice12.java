package unit1;

import java.util.Scanner;

public class Exersice12 {

	public static void main(String[] args) {

		double appleKgQty;
		double pearKgQty;
		double total;
		char currency = '€';
		final double APPLE_KG_PRICE = 2.35;
		final double PEAR_KG_PRICE = 1.95;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce kilograms of apples sold: ");
		appleKgQty = scanner.nextDouble();

		System.out.print("Introduce kilograms of pears sold: ");
		pearKgQty = scanner.nextDouble();

		total = appleKgQty * APPLE_KG_PRICE + pearKgQty * PEAR_KG_PRICE;

		System.out.printf("The total amount is %.2f%c", total, currency);

		scanner.close();

	}

}
