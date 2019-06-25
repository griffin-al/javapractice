package projects;

import javax.swing.JOptionPane;

public class Program {
	public static void main(String[] args) {
		String input;
		double taxed = 0, 
			   num = 0,
			   untaxed = 0;
		
		final double TAX = 1.095;
		
		
		do {
			input = JOptionPane.showInputDialog("Add a dollar amount, enter -1 to quit or 0 to reset."
					+ "\nTax = 9.5%"
					+ String.format("\nUntaxed Total: $%.2f", untaxed)
					+ String.format("\n    Taxed Total: $%.2f", taxed * TAX));
			num = Double.parseDouble(input);
			untaxed += num;
			
			if(num == -1)
				break;
			else if(num == 0) {
				taxed = num = untaxed = 0;
			}
			
			num += taxed;
			taxed = num *= TAX;
			JOptionPane.showMessageDialog(null, String.format("The sales price is now $%.2f.", taxed));
			taxed = untaxed;
		}
		while(num != -1);
		
		System.exit(0);
	}
}