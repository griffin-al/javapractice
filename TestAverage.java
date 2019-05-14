package Work;

import javax.swing.JOptionPane;

public class TestAverage
{
   public static void main(String[] args){
	   int test1, test2, test3;
	   float average;
	   String response;
	   
	   response = JOptionPane.showInputDialog("Enter test 1 grade.");
	   test1 = Integer.parseInt(response);
	   response = JOptionPane.showInputDialog("Enter test 2 grade.");
	   test2 = Integer.parseInt(response);
	   response = JOptionPane.showInputDialog("Enter test 3 grade.");
	   test3 = Integer.parseInt(response);
	   
	   average = (float)(test1 + test2 + test3)/3;
	   JOptionPane.showMessageDialog(null, "Test 1: " + test1 + "\nTest 2: " + test2 
			   + "\nTest 3: " + test3 + "\nAverage: " + average);
	   
	   System.exit(0);
   }
}
