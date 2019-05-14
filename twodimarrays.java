package projects;

public class Program
{
   public static void main(String[] args)
   {
	   final int ROWS = 3;
	   final int COLUMNS = 15;
	   
	   int[][] numbers = new int[ROWS][COLUMNS];
	   
	   //     position,  array,   increment
	   for(int row = 0; row < ROWS; row++) {
		   for(int col = 0; col < COLUMNS; col++) {
			   numbers[row][col] = 0;
		   }
	   }
      
	   for(int row = 0; row < ROWS; row++) {
		   for(int col = 0; col < COLUMNS; col++) {
			   System.out.print(numbers[row][col]);
		   }
		   System.out.println();
	   }
   }
}