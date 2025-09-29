package part2;

import java.util.Scanner;

public class Exersice05 {

	public static void main(String[] args) {
		//Declaration of initial seconds constant
		final int INITIAL_SECONDS;
		//Declaration of hours, minutes and seconds variables
		int hours;
		int minutes;
		int seconds;
		
		//Scanner object created
		Scanner scanner = new Scanner(System.in);
		
		//Number of initial seconds is asked for
		System.out.print("Introduce a number of seconds: ");
		INITIAL_SECONDS = scanner.nextInt();
		
		seconds = INITIAL_SECONDS;
		
		//Hours, minutes and seconds calculated
		hours = seconds/3600;
		
		seconds %= 3600;
		
		minutes = seconds/60;
		
		seconds %= 60;
		
		//Output message
		System.out.printf("%d seconds is equal to %d hours, %d minutes and %d seconds.", INITIAL_SECONDS, hours, minutes, seconds);
		
		
		//Scanner closed
		scanner.close();

	}

}
