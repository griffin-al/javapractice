package projects;

public class Program {
   public static void main(String[] args) {
	   Guy name1 = new Guy("Matt", 16);
	   Guy name2 = new Guy(name1);
	   name2.setAge(25);
	   
	   Guy.check(name1, name2);
	   
   }
   
}
