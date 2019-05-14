package Work;

import javax.swing.JOptionPane;

public class CookieCalories
{
   public static void main(String[] args){
	   int bagCookies = 40,
	       servingSize = 10,
	       caloriesServing = 300,
	       cookiesEaten;
	   
	   int cookiesPerServing = bagCookies / servingSize,	 //4 cookies a serving
	       caloriesPerCookie = caloriesServing / cookiesPerServing,		// 75 calories 
	       caloriesConsumed;
	   
	   String	response;
	   response = JOptionPane.showInputDialog("Enter cookies eaten.");
	  
	   cookiesEaten = Integer.parseInt(response);
	   
	   caloriesConsumed = cookiesEaten * caloriesPerCookie;
	   JOptionPane.showMessageDialog(null, "You have consumed " + caloriesConsumed + " calories.");
	   
	   System.exit(0);
   }
}
