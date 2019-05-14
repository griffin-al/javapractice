package projects;

import java.util.Scanner;

public class Program{
	public static void main(String[] arg) {
		String name;
		name = getName();
		
		System.out.println("Okay, your name is " + name);
	}
	
	public static String getName() {
		Scanner keyboard = new Scanner(System.in);
		String input;
		System.out.print("Enter your name, dude: ");
		input = keyboard.nextLine();
		keyboard.close();
		return input;	
	}

}