package projects;
import java.io.*;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		File file = new File("NumbersList.txt");
		Scanner doc = new Scanner(file);
		final int SIZE = 5;
		int [] array = new int[SIZE];
		int i = 0;
		while(doc.hasNextLine() && i < array.length){
			array[i] = doc.nextInt();
			System.out.println(array[i]);
		}
		
		doc.close();
	}
}