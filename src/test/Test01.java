package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce the first number: ");
		num1 = scanner.nextInt();
		
		System.out.print("Introduce the second number: ");
		num2 = scanner.nextInt();
		
		System.out.print("Introduce the third number: ");
		num3 = scanner.nextInt();
		
		avg = (num1 + num2 + num3) / 3.0;
		
		System.out.printf("The average is %f.", avg);
		
		
		
		scanner.close();

	}

}
