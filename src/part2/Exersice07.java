package part2;

import java.util.Scanner;

public class Exersice07 {

	public static void main(String[] args) {

		//Initialization of constants for fixed prices
		final double kidPrice = 15.5;
		final int adultPrice = 20;
		
		//Declarations of amount of tickets for both kids and adults
		int kidTickets;
		int adultTickets;
		
		//Currenct variable
		char currency = '€';
		
		//Total amount to pay variable
		double total;
		
		//Scanner creation
		Scanner scanner = new Scanner(System.in);
		
		//Quantity of each kind of tickets is asked for
		System.out.print("How many tickets for kids do you want to purchase?: ");
		kidTickets = scanner.nextInt();
		System.out.print("How many tickets for adults do you want to purchase?: ");
		adultTickets = scanner.nextInt();
		
		//Total is calculated
		total = kidTickets * kidPrice + adultTickets * adultPrice;
		
		//Discount is applied if total>=100
		total *= (total>=100) ? 0.95 : 1;
		
		//Output message
		System.out.printf("Your total is %.2f%c.", total, currency);
		
		//Scanner closed
		scanner.close();
		

	}

}
