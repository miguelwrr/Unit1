package unit1;

import java.util.Scanner;

public class Exersice12 {

	public static void main(String[] args) {

		//quantity of kilograms of apples
		double appleKgQty;
		//quantity of kilograms of pears
		double pearKgQty;
		//total amount of money spent on fruit
		double total;
		//euro currency character
		char currency = '€';
		//price of each kilogram of apples
		final double APPLE_KG_PRICE = 2.35;
		//price of each kilogram of pears
		final double PEAR_KG_PRICE = 1.95;

		//Scanner object is created
		Scanner scanner = new Scanner(System.in);

		//User is asked for kilograms of apples sold
		System.out.print("Introduce kilograms of apples sold: ");
		appleKgQty = scanner.nextDouble();

		//User is asked for kilograms of pears sold
		System.out.print("Introduce kilograms of pears sold: ");
		pearKgQty = scanner.nextDouble();

		total = appleKgQty * APPLE_KG_PRICE + pearKgQty * PEAR_KG_PRICE;

		System.out.printf("The total amount is %.2f%c", total, currency);

		scanner.close();

	}

}
