package projects;

import java.util.Scanner;
import java.util.Random;

public class Program{
	public static void main(String[] args) {
		String PCColor = new String();
		String UserColor = new String();
		int matches = 0;
		
		for(int i = 1; i <= 10; i++) {
			PCColor = getPCColor();
			UserColor = getUserColor();
			
			System.out.println("PC Color:\t" + PCColor);
			System.out.println("User Color:\t" + UserColor);
			
			if(PCColor.equals(UserColor))
				matches += 1;
		}
		
		System.out.println("Congratulations, you matched the computer " + matches + "/10 times!");
		
	}
	
	public static String getUserColor() {
		Scanner keyboard = new Scanner(System.in);
		String	Red		= new String("red"), 
				Green	= new String("Green"), 
				Blue	= new String("Blue"), 
				Orange	= new String("Orange"), 
				Yellow	= new String("Yellow"),
				Color	= new String();
		int 	choice;
		
		System.out.println("Pick a color...");
		System.out.print("1> Red\n2> Green\n3> Blue"
				+ "\n4> Orange\n5> Yellow -- ");
	
		choice = keyboard.nextInt();
		System.out.println();
		
		while(choice < 0 || choice > 5) {
			System.out.println("Wrong Choice. Choose a number between 1 and 5...");
			choice = keyboard.nextInt();
		}
		
		switch(choice) {
		case 1:
			Color = Red;
			break;
		case 2:
			Color = Green;
			break;
		case 3:
			Color = Blue;
			break;
		case 4:
			Color = Orange;
			break;
		case 5:
			Color = Yellow;
		}
		
		//keyboard.close();
		return Color;
	}
	
	public static String getPCColor(){
		Random rNum = new Random();
		String	Red		= new String("red"), 
				Green	= new String("Green"), 
				Blue	= new String("Blue"), 
				Orange	= new String("Orange"), 
				Yellow	= new String("Yellow"),
				Color	= new String();
		int ranNum = rNum.nextInt(5);
		
		switch (ranNum) {
		case 0:
			Color = Red;
			break;
		case 1:
			Color = Green;
			break;
		case 2:
			Color = Blue;
			break;
		case 3:
			Color = Orange;
			break;
		case 4:
			Color = Yellow;
		}
		
		return Color;
	}
}