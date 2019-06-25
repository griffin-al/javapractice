package projects;

public class Guy {
	
	private static int numGuys;
	private String name;
	private int age;
	
	//To show how many Guy objects there are
	public Guy() {
		numGuys++;
	}
	
	//Constructor
	public Guy(String n, int yr) {
		name = n;
		age = yr;
	}
	
	//Copy Constructor for duplicating objects
	public Guy(Guy object2) {
		name = object2.name;
		age = object2.age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public int getGuys() {
		return numGuys;
	}
	
	public static int getSum(int a, int b) {
		return a + b;
	}
	
	public String toString() {
		String str;
		
		str = "Guy name: " + name +
			  "\nAge: " + age;
		
		return str;
	}
	
	//Checks if the contents are equal
	public boolean equals(Guy object2) {
		boolean status;
		
		if(object2.name == name && object2.age == age)
			status = true;
		else
			status = false;
		
		return status;
	}
	
	public Guy copy() {
		Guy someGuy = new Guy(name, age);
		return someGuy;
	}
	
	public static void check(Guy a, Guy b) {
		   if(a == b)
			   System.out.println("Their addresses are the same");
		   else
			   System.out.println("They are not the same object");
		   
		   if(a.equals(b))
			   System.out.println("Similar Contents");
		   else
			   System.out.println("Different Contents");
		   
	   }	
}
