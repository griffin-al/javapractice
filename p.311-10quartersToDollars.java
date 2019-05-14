package projects;

import java.util.Scanner;

public class Program{
	public static void main(String[] arg) {
		int quarters;
		double dollars;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many quarters do you have, dude? ");
		quarters = keyboard.nextInt();
		
		dollars = quartersToDollars(quarters);
		
		System.out.printf("Congratulations, bro, you have %.2f dollars!", dollars);
		
		keyboard.close();
	}
	
	public static double quartersToDollars(int numQuarters) {
		double dollars;
		dollars = numQuarters * 0.25;
		return dollars;
	}
}