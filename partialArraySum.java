package projects;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final int SIZE = 20;
		int[] numbers = new int[SIZE];
		int count = 0, total = 0;
		
		
		System.out.println("Enter in numbers, and type -1 to quit");
		
		while(count < numbers.length) {
			numbers[count] = keyboard.nextInt();
			if(numbers[count] == -1)
				break;
			total += numbers[count];
			count++;
		}
		
		System.out.println("The numbers you entered are:");
		
		for(int i = 0; i < count; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println("\nTOTAL: " + total);
		
		keyboard.close();
	}
}