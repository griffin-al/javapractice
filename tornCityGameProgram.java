package projects;

public class Program {
   public static void main(String[] args) {
	   final int DAYS = 60;
	   int	C1Points = 0,
			C2Points = 0;
	   
	   for(int i = 0; i < DAYS; i++) {
		   C1Points += 8; //Company "Stars"
		   C2Points += 10;
	   }
	   
	   int result1 = C1Points / 20, //Cost of items to sell
		   result2 = C2Points / 20;
	   
	   int profit1 = result1 * 4000000, //Item Sell Price
		   profit2 = result2 * 4000000;
	   
	   System.out.printf("Company 1 will provide $%,d"
	   		+ "\nCompany 2 will provide $%,d", profit1, profit2);
	   
   }
   
}
