package part1;

import java.util.Scanner;

public class Exersice07 {

	public static void main(String[] args) {
		
		//name variable
		String name;
		
		//address variable
		String address;
		
		//telephone number variable
		int telephone;
		
		//Scanner object is created
		Scanner scanner = new Scanner(System.in);
		
		//User is asked for their name
		System.out.print("Introduce your name: ");
		name = scanner.nextLine();
		
		//User is asked for their address
		System.out.print("Introduce your address: ");
		address = scanner.nextLine();
		
		//User is asked for their telephone number
		System.out.print("Introduce your telephone number: ");
		telephone = scanner.nextInt();
		
		//All three variables are printed out.
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Telephone number: " + telephone);
		
		//Scanner is closed
		scanner.close();
	}

}
