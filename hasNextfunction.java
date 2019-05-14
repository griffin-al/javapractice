package projects;

import java.io.*;
import java.util.Scanner;

public class Basic{
	public static void main(String[] args) throws IOException {
		File file = new File("customers.txt");
		
		Scanner inputFile = new Scanner(file);
		String name;
		
		while(inputFile.hasNext()) {
			name = inputFile.nextLine();
			System.out.println(name);
		}
		
		inputFile.close();
	
	}
}