import java.util.Scanner;

public class Program{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String input = new String();
		input = keyboard.nextLine();
		
		int strLen = input.length();
		
		char[] reversed = new char[strLen];
		char[] temp = new char[strLen];
		
		for(int i = 0; i < strLen; i++) {
			temp[i] = input.charAt(i);
		}
		
		for(int i = 0, j = (strLen) - 1; i < strLen; i++, j--) {
			reversed[i] = temp[j];
		}
		
		System.out.print("Reversed String: ");
		for(int i = 0; i < strLen; i++) {
			System.out.print(reversed[i]);
		}
		
	}
}