package projects;

import java.io.*;

public class Program {
	public static void main(String[] args) throws IOException {
		PrintWriter document = new PrintWriter("rAudioNums.txt");
		
		for(int i = 0; i < 206; i++) {
			document.println((i+1) + ".mp3");
		}
		
		document.close();
	}
}