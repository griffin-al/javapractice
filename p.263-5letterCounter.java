package projects;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String text, input;
		
		char letter;
		int lTotal = 0;
		
		System.out.println("Enter a phrase: ");
		text = keyboard.nextLine();
		
		System.out.print("Now enter a character: ");
		input = keyboard.nextLine();
		letter = input.charAt(0);
		
		for(int i = 0; i < (text.length()); i++) {
			if(letter == text.charAt(i)) {
				lTotal += 1;
			}
		}
		
		System.out.println("The letter '" + letter + "' " + "appears " + lTotal + " time(s)");
		
		keyboard.close();		
	}
}
