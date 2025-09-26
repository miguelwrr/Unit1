package unit1;

import java.util.Scanner;

public class Exersice13 {

	public static void main(String[] args) {
		
		boolean isRaining;
		boolean tasksComplete;
		boolean library;
		boolean canGo;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Is it raining? (true/false): ");
		isRaining = scanner.nextBoolean();
		
		System.out.print("Have all tasks been completed? (true/false): ");
		tasksComplete = scanner.nextBoolean();
		
		System.out.print("Are you going to the library? (true/false): ");
		library = scanner.nextBoolean();
		
		canGo = !isRaining && tasksComplete || library;
		
		System.out.printf("Can you go?: %b", canGo);
//		System.out.println((canGo) ? "You can go." : "You cannot go");
		
		scanner.close();
		
	}

}
