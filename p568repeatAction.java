package projects;

import java.util.Scanner;

public class Program
{
   public static void main(String[] args)
   {
	   Scanner keyboard = new Scanner(System.in);
	   String input;
	   char choice;
	   do{
	   	System.out.print("Do you want to repeat "
	   			+ " the program or quit? (R/Q)");
	   	input = keyboard.nextLine();
	   	choice = input.charAt(0);
	   } while(Character.toUpperCase(choice) != 'Q');
	  
   }
}

