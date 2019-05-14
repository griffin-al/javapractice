package projects;

import java.util.Scanner;

public class Basic{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input;
		char response;
		System.out.print("Enter Y/N: ");
		
		input = keyboard.nextLine();
		response = input.charAt(0);
		
		while((response != 'Y' && response != 'y') && (response != 'N' && response != 'n'))
		{
			System.out.print("INVALID INPUT! \n Please Enter Y/N: ");
			input = keyboard.nextLine();
			response = input.charAt(0);
		}
		
		System.out.println("Great you entered: " + response);
		
		keyboard.close();
	}
}