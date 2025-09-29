package part2;

import java.util.Scanner;

public class Exersice07 {

	public static void main(String[] args) {

		final double kidPrice = 15.5;
		final int adultPrice = 20;
		int kidTickets;
		int adultTickets;
		char currency = '€';
		double total;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many tickets for kids do you want to purchase?: ");
		kidTickets = scanner.nextInt();
		System.out.print("How many tickets for adults do you want to purchase?: ");
		adultTickets = scanner.nextInt();
		
		total = kidTickets * kidPrice + adultTickets * adultPrice;
		
		total *= (total>=100) ? 0.95 : 1;
		
		System.out.printf("Your total is %.2f%c.", total, currency);
		
		
		
		
		scanner.close();
		

	}

}
