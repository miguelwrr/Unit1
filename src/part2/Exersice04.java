package part2;

import java.util.Scanner;

public class Exersice04 {

	public static void main(String[] args) {
		
		//All coefficients and values
		int coefA;
		int coefB;
		int coefC;
		int valX;
		int valY;
		
		//Scanner object is created
		Scanner scanner = new Scanner(System.in);
		
		//All 4 values are inputted
		System.out.print("Introduce coefficient A: ");
		coefA = scanner.nextInt();
		System.out.print("Introduce coefficient B: ");
		coefB = scanner.nextInt();
		System.out.print("Introduce coefficient C: ");
		coefC = scanner.nextInt();
		System.out.print("Introduce variable X: ");
		valX = scanner.nextInt();
		
		//Y is calculated
		valY = (int) (coefA * Math.pow(valX, 2)) + coefB * valX + coefC;
		
		//Output message
		System.out.printf("The value of Y is %d.", valY);
		
		//Scanner closed
		scanner.close();

	}

}
