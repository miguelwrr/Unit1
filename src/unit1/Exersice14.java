package unit1;

import java.util.Scanner;


public class Exersice14 {
	
	public static void main(String[] args) {
		
		int term1;
		int term2;
		int term3;
		double average;
		int avgOnPaper;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce the first term grade: ");
		term1 = scanner.nextInt();
		
		System.out.print("Introduce the second term grade: ");
		term2 = scanner.nextInt();
		
		System.out.print("Introduce the third term grade: ");
		term3 = scanner.nextInt();
		
		average = (term1 + term2 + term3) * 1.0 / 3;
		
		avgOnPaper = (int) Math.round(average);
		
		System.out.printf("Average on paper: %d\n", avgOnPaper);
		System.out.printf("Real average: %f", average);
		
		
		
		
		
		scanner.close();
		
	}
}
