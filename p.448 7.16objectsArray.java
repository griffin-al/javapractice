package projects;
//Requires Rectangle.java

import java.util.Random;

public class Program {
	public static void main(String[] args) {
		Random rnum = new Random();
		final int SIZE = 5;
		
		Rectangle[] rects = new Rectangle[SIZE];
		
		System.out.println("The Length of each rectangle is: ");
		for(int i = 0; i < rects.length; i++) {
			rects[i] = new Rectangle(rnum.nextInt(100),rnum.nextInt(100));
			System.out.println("RECT " + (i+1) + " " + rects[i].getLength());
		}
		
		System.out.println("The Width of each rectangle is : ");
		for(int i = 0; i < rects.length; i++) {
			System.out.println("RECT " + (i+1) + " " + rects[i].getWidth());
		}
		
		System.out.println("The Area of each rectangle is : ");
		for(int i = 0; i < rects.length; i++) {
			System.out.println("RECT " + (i+1) + " " + rects[i].getArea());
		}
		
		
	}
}