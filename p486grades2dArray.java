package projects;

import java.util.Random;

public class Program {
	public static void main(String[] args) {
		Random rnum = new Random();
		
		final int ROWS = 30; //Students
		final int COLS = 10; //Grades
		
		int[][] grades = new int[ROWS][COLS];
		
		int sumGrades = 0,
			scores = 0;
		
		
		
		for(int row = 0; row < ROWS; row++) {
			for(int col = 0; col < COLS; col++) {
				do {
				grades[row][col] = rnum.nextInt(100);
				} while(grades[row][col] <= 50);
				sumGrades += grades[row][col];
				scores++;
				System.out.print(grades[row][col] + "\t");
			}
			System.out.println();
		}
		
		
		
		double avgGrades = sumGrades / (double)scores;
		
		System.out.println("The average is " + avgGrades + ".");
		
	}
}