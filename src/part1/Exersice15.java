package part1;

import java.util.Locale;
import java.util.Scanner;

public class Exersice15 {

	public static void main(String[] args) {
		final int TAX = 21;
		double price;
		double taxedPrice;
		
		Scanner scanner = new Scanner(System.in);
		
		scanner.useLocale(Locale.US);
		
		System.out.print("Introduce a price: ");
		price = scanner.nextDouble();
		
		taxedPrice = price + TAX * price / 100;
		
		System.out.printf("The taxed price for %.2f will be %.2f.", price, taxedPrice);
		
		
		scanner.close();

	}

}
