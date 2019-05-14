package projects;

import java.io.*;

public class Program{
	public static void main(String[] args) throws IOException {
		PrintWriter primeNums = new PrintWriter("PrimeNumbers.txt");
		
		boolean primeNumber;
		int number;
		
		for(int i = 1; i <= 1000; i++) {
			number = i;
			primeNumber = isPrime(number);
			
			if(primeNumber)
				primeNums.print(number + " is PRIME!");
			else
				primeNums.print(number + " -");
			primeNums.println();
		}
		
		System.out.println("DONE");
		primeNums.close();
		System.exit(0);
	}
	
	public static boolean isPrime(int num) {
		boolean check = false;
		
		for(int i = 2; i <= num - 1; i++) {
			if(num % i == 0) {
				check = false;
				break;
			}
			else
				check = true;
		}
		
		return check;
	}
}