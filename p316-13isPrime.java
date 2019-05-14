package projects;

public class Program{
	public static void main(String[] args) {
		boolean primeNumber;
		int number = 17;
		
		primeNumber = isPrime(number);
		
		if(primeNumber)
			System.out.println(number + " is a prime number!");
		else
			System.out.println(number + " is NOT a prime number.");
		
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