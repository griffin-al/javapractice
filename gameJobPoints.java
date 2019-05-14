package projects;

public class Program
{
   public static void main(String[] args)
   {
      int day = 1, points = 0;
      
      for(int i = 0; i < 60; i++) {
    	  day++;
    	  points += 10;
    	  
    	  if(points % 12 == 0) {
    		  System.out.println(day + "* " + points);
    	  }
    	  else
    		  System.out.println(day);
      }
   }
}