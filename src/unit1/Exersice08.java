package unit1;

import java.util.Scanner;

public class Exersice08 {

	public static void main(String[] args) {
		
		//name variable
		String name;
		
		//age variable
		int age;
		
		//Scanner object is created
		Scanner scanner = new Scanner(System.in);
		
		//User is asked for their name
		System.out.print("Introduce your name: ");
		name = scanner.nextLine();
		
		//User is asked for their age
		System.out.print("Introduce your age");
		age = scanner.nextInt();
		
		//Message is printed out
		System.out.println("Hello " + name + ", you are " + age + " years old, look how old you are!");
		
		//Scanner is closed
		scanner.close();
		

	}

}
