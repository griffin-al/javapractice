//Requires Rectangle.java

package projects;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
/*		ArrayList<Rectangle> boxes = new ArrayList<Rectangle>();
		
		boxes.add(new Rectangle(20,30));
		boxes.add(new Rectangle(10,10));
		boxes.add(new Rectangle(14,14));
		boxes.add(new Rectangle(10,12));
		boxes.add(new Rectangle(15,20));
		
		System.out.println("The area of the boxes is below");
		
		for(int i = 0; i < boxes.size(); i++) {
			System.out.println(boxes.get(i).getArea());
		}*/
		
		Guy ramon = new Guy();
		ramon.setName("Ramon");
		ramon.setAge(26);
		
		Guy doug = new Guy();
		doug.setName("Doug");
		doug.setAge(16);
		
		Guy matt = new Guy();
		matt.setName("Matt");
		matt.setAge(20);
		
		ArrayList<Guy> dudes = new ArrayList<Guy>();
		
		dudes.add(ramon);
		dudes.add(doug);
		dudes.add(matt);
		
		for(int i = 0; i < dudes.size(); i++) {
			System.out.print(dudes.get(i));
			System.out.println(" " + dudes.get(i).getName());
		}
		
	}
}