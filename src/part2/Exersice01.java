package part2;

import java.util.Locale;
import java.util.Scanner;

public class Exersice01 {

	public static void main(String[] args) {
		
		//Number to input
		double num;
		
		//Decimal segment of the input number
		double decimals;
		
		//Number to output
		int roundedNum;
		
		//Scanner object creation
		Scanner scanner = new Scanner(System.in);
		
		//Locale set
		scanner.useLocale(Locale.US);
		
		//Number is asked for
		System.out.print("Introduce number to round: ");
		num = scanner.nextDouble();
		
		//Decimal segment is stored 
		decimals = num - (int) num;
		
		//Rounded number is calculated
		roundedNum = (int) num + ((decimals >= 0.5) ? 1 : 0);
		
		//Output message
		System.out.printf("Rounded number: %d", roundedNum);
		
		//Scanner closed
		scanner.close();

	}

}
