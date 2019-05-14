package projects;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int num;
		boolean verify;
		
		System.out.println("Enter a number between 1 and 100: ");
		num = keyboard.nextInt();
		verify = isValid(num);
		
		while(!verify) {
			System.out.println("Please try again...");
			num = keyboard.nextInt();
			verify = isValid(num);
		}
		
		System.out.println("GOOD choice!");
		
		keyboard.close();
	}
	
	public static boolean isValid(int number) {
		if(number < 1 || number > 100)
			return false;
		else
			return true;
	}
}