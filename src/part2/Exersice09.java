package part2;

import java.util.Scanner;

public class Exersice09 {

	public static void main(String[] args) {
		//Declaration of problem code and volume variables
		int problem;
		int volume;
		
		//Scanner creation
		Scanner reader = new Scanner(System.in);
		
		//Problem code is asked for
		System.out.print("Introduce a problem code: ");
		problem = reader.nextInt();
		
		//Volume is calculated
		volume = problem/100;
		
		//Output message
		System.out.printf("Problem %d is in volume %d", problem, volume);

		//Scanner closed
		reader.close();
	}

}
