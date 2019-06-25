package projects;

public class Program
{
   public static void main(String[] args) {
	  int[][] array = { {30, 25, 20},
	  				    {15, 10,  5} };
	  int total = 0;
	  
	  
	  for(int row = 0; row < array.length; row++) {
		  for(int col = 0; col < array[row].length; col++) {
			  total += array[row][col];
		  }
	  }
	  
	  System.out.println(total);
	
	  System.out.println("Rows: " + array.length);
	  System.out.println("Columns: " + array[0].length);
	  
	  for(int row = 0; row < array.length; row++) {
		  total = 0;
		  for(int col = 0; col < array[row].length; col++) {
			  total += array[row][col];
			  System.out.println("Total of row " + row + " is " + total);
		  }
	  }
	 
   }
}