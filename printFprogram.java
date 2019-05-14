package projects;

import java.util.Scanner;

public class Basic
{
   public static void main(String[] args){
	   Scanner keyboard = new Scanner(System.in);
	   double paycheck, taxes;
	   
	   System.out.print("Enter your paycheck and I will take out taxes: ");
	   paycheck = keyboard.nextDouble();
	   
	   paycheck *= .90;
	   taxes = paycheck * 0.115;
	   
	   System.out.printf("You now have $%.2f, $%.2f in taxes was taken out.", paycheck, taxes);
	   
	   keyboard.close();
			    
   }
}
