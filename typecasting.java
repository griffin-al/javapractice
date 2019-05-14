package projects;

class Application {

	public static void main(String[] args) {
		int	test1 = 70,
			test2 = 84,
			test3 = 56,
			test4 = 80;
		
		double finalGrade = (double)(0.25 * (test1 + test2) / 2);
		
		System.out.println("Intermediate grade: " + finalGrade);
		
		finalGrade += (double)(0.75 * (test3 + test4) / 2);
		
		System.out.println("Final grade: " + finalGrade);

	}

}
