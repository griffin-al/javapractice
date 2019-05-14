package projects;

import java.util.Random;

public class Program{
	public static void main(String[] arg) {
		Random ranNum = new Random();
		
		int numbers;
		
		for(int i = 0; i <= 1000; i++) {
			numbers = ranNum.nextInt(10);
			if(i%20 == 0 && i != 0)
				System.out.println();
			System.out.printf("%3d ", numbers);
		}
	}
}