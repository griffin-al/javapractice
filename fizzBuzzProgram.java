package projects;

import java.io.*;

public class Basic{
	public static void main(String[] args) throws IOException {
		PrintWriter document = new PrintWriter("FizzBuzz.txt");
		
		String mess1, mess2;
		mess1 = "Fizz";
		mess2 = "Buzz";
		
		for(int i = 1; i <= 100; i++) {
			if((i % 3 == 0) && (i % 5 == 0)) {
				document.println(mess1 + mess2);
			}
			else if(i % 3 == 0) {
				document.println(mess1);
			}
			else if(i % 5 == 0) {
				document.println(mess2);
			}
			else
				document.println(i);
		}
		
		System.out.println("Document created");
		document.close();
	}
}