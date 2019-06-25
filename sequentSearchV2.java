package projects;

public class Program
{
   public static void main(String[] args) {
	   int[] nums = {10,20,30,40,50};
	   boolean found = false;
	   int value = 41;
	   
	   for(int i = 0; i < nums.length; i++) {
		   if(value == nums[i])
			   found = true;
	   }
	   
	   if(found == true)
		   System.out.println("The value " + value + " is in the array");
	   else
		   System.out.println("The value " + value + " is NOT in the array");
	
	   
   }
}