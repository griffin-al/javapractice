package projects;

public class Program
{
   public static void main(String[] args)
   {
	   int total = 0;
	   String str = new String("cHiCKenS aRe DELiCiOs maN!");
	   char ch;
	   
	   for(int i = 0; i < str.length(); i++) {
		   ch = str.charAt(i);
		   if(Character.isUpperCase(ch))
			   total++;
	   }
	   
	   System.out.println("The string \"" + str + "\" has " + total + " capital letters.");
	  
   }
}

