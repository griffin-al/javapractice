//Requires Guy.java
//An array of objects that prints out a list

package projects;

public class Program{
	public static void main(String[] args) {
		final int SIZE = 5;
		Guy[] dudes = new Guy[SIZE];
		
		for(int i = 0; i < dudes.length; i++) {
			dudes[i] = new Guy();
			System.out.println(dudes[i].getName());
		}
		
		dudes[0].setName("Luke");
		dudes[1].setName("Daniel");
		dudes[2].setName("Ricky");
		dudes[3].setName("Matt");
		dudes[4].setName("Blake");
		System.out.println();
		
		for(int i = 0; i < dudes.length; i++) {
			System.out.println(dudes[i].getName());
		}
		
		//dudes[2] = null;
		
		System.out.println();
		
		System.out.println("Now the dudes are:\n");
		for(int i = 0; i < dudes.length; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(dudes[i].getName() + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < dudes.length; i++) {
				System.out.print(dudes[i].getName() + "\t");
			}
			System.out.println();
		}
		
	}
}