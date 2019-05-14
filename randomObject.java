package projects;

import java.util.Random;

public class Basic
{
   public static void main(String[] args)
   {
      Random ranNum = new Random();
      int sumHeads = 0;
      int sumTails = 0;
      float ratio;
      
      
      for(int i = 1; i <= 10; i++) {
    	  int num = ranNum.nextInt(2);
    	  if(num == 0) {
    		  System.out.println("ROUND: " + i + "\t" + "heads");
    		  sumHeads += 1;
    	  }
    	  else if(num == 1) {
    		  System.out.println("ROUND: " + i + "\t" + "tails");
    		  sumTails += 1;
    	  }
      }
      
      ratio = (float)sumHeads / sumTails;
      
      System.out.println("Total heads: " + sumHeads);
      System.out.println("Total tails: " + sumTails);
      System.out.printf("RATIO: %.3f", ratio);
   }
}