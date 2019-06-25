package projects;

import java.util.Scanner;

public class Program
{
   public static void main(String[] args)
   {
	   final int SIZE = 5;
	   
	   Guy[] dudes = new Guy[SIZE];
	   
	   for(int i = 0; i < dudes.length; i++) {
		   dudes[i] = getGuy();
	   }
	   
	   System.out.println("The dudes you entered in are ");
	   
	   for(Guy guys : dudes)
		   System.out.print(guys.getName() + " ");
   }
   
   public static Guy getGuy() {
	   Scanner keyboard = new Scanner(System.in);
	   String name = new String();
	   int age;
	   
	   System.out.print("Enter guy name: ");
	   name = keyboard.nextLine();
	   System.out.print("Enter " + name + "'s age: ");
	   age = keyboard.nextInt();
	   
	   Guy someDude = new Guy(name,age);
	   
	   return someDude;
	   
   }
}
