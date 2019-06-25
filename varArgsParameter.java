package projects;

import javax.swing.JOptionPane;

public class Program {
	public static void main(String[] args) {
		int num1, num2, num3;
		String input;
		int total;
		
		JOptionPane.showMessageDialog(null, "Please enter three integers.");
		input = JOptionPane.showInputDialog("Enter number 1");
		
		num1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Enter number 2");
		num2 = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter number 3");
		num3 = Integer.parseInt(input);
		
		total = sum(num1, num2, num3);
		
		JOptionPane.showMessageDialog(null, "The total of the numbers is " + total);
		
		System.exit(0);
		}
	
	public static int sum(int... numbers) {
		int total = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		
		return total;
	}
}
