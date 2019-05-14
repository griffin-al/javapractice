package projects;

import java.io.*;
import javax.swing.JOptionPane;

public class Basic{
	public static void main(String[] args) throws IOException {
		
		int num;
		String input;
		
		PrintWriter document = new PrintWriter("coolStuff.txt");
		
		input = JOptionPane.showInputDialog("Enter a number to double it 20 times dude!");
		num = Integer.parseInt(input);
		
		while(num > 25 || num < 0)
		{
			JOptionPane.showMessageDialog(null, "SORRY, TOO LARGE OR TOO SMALL NUMBER!");
			input = JOptionPane.showInputDialog("Enter a better number to double!");
			num = Integer.parseInt(input);
		}
		
		document.print("Number doubled: " + num);
		document.println();
		
		for(int i = 1; i <= 20; i++) {
			num += num;
			document.println(i + "\t" + num);
		}
		
		document.close();
		JOptionPane.showMessageDialog(null, "Document coolStuff.txt created!");
		System.exit(0);
	}
}