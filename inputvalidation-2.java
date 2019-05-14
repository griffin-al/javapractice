package projects;

import java.util.Scanner;

public class Basic{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input;
		System.out.print("Enter the words yes or no: ");
		
		input = keyboard.nextLine();
		
		while(!(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")))
		{
			System.out.print("INVALID INPUT! \nPlease enter the words YES or NO! ");
			input = keyboard.nextLine();
		}
		
		System.out.println("Great you entered: " + input);
		
		keyboard.close();
	}
}