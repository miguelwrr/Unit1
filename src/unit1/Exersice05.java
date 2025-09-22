package unit1;

import java.util.Scanner;

public class Exersice05 {

	public static void main(String[] args) {
		
		//Variables are declared
		double radius;
		double length;
		double area;
		
		//Scanner object is created
		Scanner scanner = new Scanner(System.in);
		
		//User is asked for the circumference radius
		System.out.print("Introduce the circumference radius: ");
		radius = scanner.nextDouble();
		
		//Length and area are calculated
		length = 2 * Math.PI * radius;
		area = Math.PI * Math.pow(radius, 2);
		
		//Length and area are printed
		System.out.println("Length: " + length + "\nArea: " + area);
		
		//Scanner is closed
		scanner.close();

	}

}
