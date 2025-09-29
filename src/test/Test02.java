package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		//Hours variable declared
		int hours;
		//Hour rate variable declared
		double hourPrice;
		//Untaxed salary variable declared
		double untaxedSalary;
		//Taxed salary declared
		double salary;
		
		//Scanner object created
		Scanner scanner = new Scanner(System.in);
		
		//Hours are determined by the user
		System.out.print("How many hours have you worked?: ");
		hours = scanner.nextInt();
		
		//Hour rate is also determined
		System.out.print("What is your hour rate?: ");
		hourPrice = scanner.nextDouble();
		
		//Untaxed salary is calculated
		untaxedSalary = hours * hourPrice;
		
		//Taxed salary is calculated
		salary = (untaxedSalary<1000) ? untaxedSalary * 0.90 : untaxedSalary * 0.85;
		
		//Salary message is printed
		System.out.printf("You are receiving %f", salary);
		
		//Scanner is closed
		scanner.close();

	}

}
