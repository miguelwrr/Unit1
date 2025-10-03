package part2;

import java.util.Scanner;

public class Exersice10 {

	public static void main(String[] args) {
		//Declaration of year and century variables
		int year;
		int century;
		
		//Scanner creation
		Scanner reader = new Scanner(System.in);
		
		//Year is asked for
		System.out.print("Introduce a year: ");
		year = reader.nextInt();
		
		//Century is calculated
		century = year%100==0 ? year/100 : year/100+1;
	
		
		//Output message
		System.out.printf("Year %d belongs to century %d.", year, century);
		
		//Scanner closed
		reader.close();

	}

}
