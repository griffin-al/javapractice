package projects;

import  javax.swing.JOptionPane;

public class Basic {
	public static void main(String[] args) {
			String input, output;
			double cost, salesPrice, total = 0.0;
			final double TAX = 0.095;
			int sentinel = -1;
			
			do {
				input = JOptionPane.showInputDialog("Enter the item's cost");
				cost = Double.parseDouble(input);
				total += cost;
				input = JOptionPane.showInputDialog("Enter another item? Enter 1 to continue or -1 to quit");
				sentinel = Integer.parseInt(input);
			}while(sentinel != -1);
			
			salesPrice = total + (total * TAX);
			
			output = String.format("Total cost: $%.2f\nSales tax: $%.3f\n"
					+ "Cost: $%.2f", total, TAX, salesPrice);
			
			JOptionPane.showMessageDialog(null, output);
			
			System.exit(0);
			
		}		
	}
	

