package projects;

import java.io.*;
import java.util.Scanner;

public class Basic{
	public static void main(String[] args) throws IOException
	{
		String document, name;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a new document name: ");
		
		document = keyboard.nextLine();
		
		document = document + ".txt";
		
		System.out.print("What is your name? ");
		name = keyboard.nextLine();
		
		PrintWriter textFile = new PrintWriter(document);
		for(int i = 1; i <= 100; i++) {
			textFile.println("I LOVED " + name + " " + i + " times!");
		}
		
		textFile.close();
		keyboard.close();
	}
}