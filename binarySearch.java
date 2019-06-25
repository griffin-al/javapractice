package projects;

public class Program {
	public static void main(String[] args) {
		int[] numbers = {10, 14, 17, 25, 33, 40, 46, 54}; //ascending order
		int num = 25;
		
		int result = binarySearch(numbers, num); //THE POSITION if found
		
		
		if(result == -1)
			System.out.println("The value " + num + " is NOT in the array");
		else
			System.out.println("The value " + num + " is in the array");
	}
	
	public static int binarySearch(int[] array, int value) {
		int 	first,
				last,
				middle,
				position;
		boolean found;
		
		first = 0;
		last = array.length - 1;
		position = -1;
		found = false;
		
		while(!found && first <= last) {
			middle = (first + last) / 2; 	//midpoint
			
			if(array[middle] == value) {
				found = true;
				position = middle;
			}
			else if(array[middle] > value)	//value is in lower half
				last = middle - 1;
			else							//value is in upper half
				first = middle + 1;
		}
		return position;
	}
}

