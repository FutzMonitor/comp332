package Week10;

/**
 * Implementation of Insertion Sort
 * @author Christian Gonzalez
 * @version October 2022
 */
public class InsertionSort {

	/**
	 * Sorts an array using the decrease-and-conquer
	 * algorithm insertion sort
	 * @param input - array to be sorted
	 */
	public static void insertionSort(int[] input) {
		for(int i = 1; i < input.length; i++) {
			int v = input[i];
			int j = i - 1;
			do {
				input[j + 1] = input[j];
				j--;
			} while (j >= 0 && input[j] > v);
			input[j + 1] = v;
		}		
	}

	/**
	 * Prints the contents of an array of ints
	 * @param input - array 
	 */
	public static void printArr(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
	}

	public static void main(String[] args) {
		int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println("Unsorted list:\n");
		printArr(a);
		insertionSort(a);
		System.out.println("\nsorted list:\n");
		printArr(a);
	}
}
