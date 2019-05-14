package projects;

import java.util.Scanner;

public class Basic
{
   public static void main(String[] args){
	   Scanner keyboard = new Scanner(System.in);
	   String response;
	   char choice;
	   
	   System.out.println("Press \n(a) to enter first name\n(b) to enter middle name\n"
	   		+ "(c) to enter last name\n(d) to enter friend's name");
	   
	   response = keyboard.nextLine();
	   choice = response.charAt(0);
	   
	   switch(choice) {
	        case 'a':
	        case 'A':
	             System.out.print("Enter your first name: ");
	             response = keyboard.nextLine();
	             System.out.println("This is your first name: " + response.toUpperCase());
	             break;
	        case 'b':
	        case 'B':
	        	 System.out.print("Enter your middle name:");
	             response = keyboard.nextLine();
	             System.out.println("This is your middle name: " + response.toUpperCase());
	             break;
	        case 'c':
	        case 'C':
	        	 System.out.print("Enter your last name:");
	             response = keyboard.nextLine();
	             System.out.println("This is your last name: " + response.toUpperCase());
	             break;
	        case 'd':
	        case 'D':
	        	 System.out.print("Enter your friend's name:");
	             response = keyboard.nextLine();
	             System.out.println("This is your friend's name: " + response.toUpperCase());
	             break;
	        default:
	        	 System.out.println("Invalid input.");
	 
	   }
	   
	   keyboard.close();
   }
}
