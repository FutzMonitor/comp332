package week9;

/**
 * Implementation of Insertion Sort via the pseudocode provided in class
 * @author Christian Gonzalez
 * @version October 2022
 */
public class InsertionSort {

	/**
	 * Sorts an array of integers using Insertion Sort.
	 * @param input - the array of ints
	 * @return the sorted list
	 */
	public static int[] insertionSort(int[] input) {
		for(int i = 1; i < input.length; i++) {
			int store = input[i];
			int j = i - 1;
			while (j >= 0 && input[j] > store) {
				input[j + 1] = input[j];	
				j--;
			}
			input[j + 1] = store;
		}
		return null;
	}
	
	/**
	 * Prints the elements of an array of ints
	 * @param input - the array of ints
	 */
	public static void printElements(int[] input) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
	}
	
	public static void main(String[] args) {
		int[] demo = {32, 1, 10, 4, 90, -1, 0, 34, 100, -40, 3};
		System.out.println("Unsorted list: \n");
		printElements(demo);
		insertionSort(demo);
		System.out.println("\n\nSorted list: \n");
		printElements(demo);
		
	}
}
