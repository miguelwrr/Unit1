package test;

import java.util.Locale;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		int hours;
		double hourPrice;
		double untaxedSalary;
		double salary;
		
		Scanner scanner = new Scanner(System.in);
		
		scanner.useLocale(Locale.US);
		
		System.out.print("How many hours have you worked?: ");
		hours = scanner.nextInt();
		
		System.out.print("What is your hour rate?: ");
		hourPrice = scanner.nextDouble();
		
		untaxedSalary = hours * hourPrice;
		
		salary = (untaxedSalary<1000) ? untaxedSalary * 0.90 : untaxedSalary * 0.85;
		
		System.out.printf("You are receiving %f", salary);
		
		scanner.close();

	}

}
