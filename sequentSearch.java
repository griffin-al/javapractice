package projects;

public class Program {
	public static void main(String[] args) {
		int [] numbers = {80, 95, 90, 60, 75};
		int value = 80;
		int element = seqSearch(numbers, value);
		
		if(element == -1)
			System.out.println("The value " + value + " is not in the array.");
		else
			System.out.println("The value " + value + " is in the array!");
	}
	
	public static int seqSearch(int [] array, int num) {
		//the num parameter is what we are searching for
		
		int element = 0;		// position in the array
		
		while(element < array.length) {
			if(array[element] == num)
				return element;
			else
				element++;
		}
		
		return -1; //returns -1 if the value cannot be found
	}
}

//Don't ask me how I did this. See page 450.