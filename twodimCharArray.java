package projects;

public class Program
{
   public static void main(String[] args)
   {
	   final int ROWS = 10;
	   final int COLUMNS = 100;
	   char[][] array = new char[ROWS][COLUMNS];
	   
	   //note: position; array; increment
	   for(int row = 0; row < ROWS; row++) {
		   for(int col = 0; col < COLUMNS; col++) {
			   array[row][col] = '.';
			   System.out.print(array[row][col]);
		   }
		   System.out.println();
	   }
   }
}