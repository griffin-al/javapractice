package projects;

import java.util.Scanner;

public class Program {
	public static void main(String[] args){
		char letter;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter character: ");
		
		letter = keyboard.next().charAt(0);
		
		switch (letter) {
		case 'a':
			System.out.println("Wrong");
			break;
		case 'b':
			System.out.println("Correct");
			break;
		default:
			System.out.println("Invalid");
		}
			
		keyboard.close();

	}
}