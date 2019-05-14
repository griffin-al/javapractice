package projects;

public class Program {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++) {
			System.out.print("#");
			for(int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println("#");
		}
	}
}
