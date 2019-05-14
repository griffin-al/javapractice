package projects;

import java.util.Random;

public class Program {
	public static void main(String[] args) {
		
		final int STUDENTS = 35;
		int [] grades = new int[STUDENTS];
		
		double average = 76.8;
		int highest_grade = 96,
			lowest_grade = 36,
			max_grade = highest_grade + 1;
		
		double target = average * STUDENTS;
		double total = 0.0;
		grades[0] = lowest_grade;
		grades[STUDENTS - 1] = highest_grade;
		
		for(int i = 1; i < STUDENTS - 1; i++) {
			grades[i] = getNum(lowest_grade, max_grade);
		}
		
		//Total
		for(int i = 0; i < STUDENTS; i++) {
			total += grades[i];
		}
		
		//Alter the middle grades
		boolean check;
		double value, difference;
		difference = target - total;
		while(difference > 0) {
			for(int i = 1; i < STUDENTS - 1; i++) {
				value = grades[i];
				check = checkMaxedA(value, highest_grade);
				if(check)
					continue;
				if(difference > 0) {
					grades[i]++;
					difference--;
				}
				else if(difference < 0)
					break;
			
				if(i == (STUDENTS - 1))
					i = 1;
			}
		}
		while(difference < 0) {
			for(int i = 1; i < STUDENTS - 1; i++) {
				value = grades[i];
				check = checkMaxedB(value, lowest_grade);
				if(check)
					continue;
				if(difference < 0) {
					grades[i]--;
					difference++;
				}
				else if(difference > 0)
					break;
			
				if(i == (STUDENTS - 1))
					i = 1;
			}
		}
		
		System.out.println("Student\t\tGrade");
		//Print the made up grades out
		for(int i = 0; i < STUDENTS; i++) {
			System.out.println((i+1) + "\t\t" + grades[i]);
		}
		
		System.out.println("target: " + target);
		//System.out.println("Current total: " + total);
		
		total = 0;
		
		for(int i = 0; i < STUDENTS; i++) {
			total += grades[i];
		}
		
		System.out.println("Verify: " + total);
	}
	
	public static int getNum(int low, int high) {
		Random rNum = new Random();
		int grade = rNum.nextInt(high);
		
		while(grade < low)
			grade = rNum.nextInt(high);
		
		return grade;
	}
	
	public static boolean checkMaxedA(double grade, int high) {
		boolean result = false;
		
		if(grade >= high)
			result = true;
		
		return result;
	}
	public static boolean checkMaxedB(double grade, int low) {
		boolean result = false;
		
		if(grade <= low)
			result = true;
		
		return result;
	}
	
}