package projects;

import java.util.Scanner;

public class Program
{
   public static void main(String[] args)
   {
	   System.out.print("Please enter a character: ");
	   char letter = getChar();
	   boolean valid;
	   
	   do{
		   if(Character.isLetter(letter)) {
			   valid = true;
			   System.out.println("Thank you for entering a letter!");
		   }
		   else{
			   valid = false;
			   System.out.print("Sorry, please enter a letter: ");
			   letter = getChar();
		   }  
	   }
	   while(!valid);   
   }
   
   public static char getChar(){
	   Scanner keyboard = new Scanner(System.in);
	   String input;
	   char let;
	   input = keyboard.nextLine();
	   
	   while(input.length() > 1) {
		   System.out.print("Enter exactly ONE character: ");
		   input = keyboard.nextLine();
	   }
	   
	   let = input.charAt(0);
	   return let;
   }
}

