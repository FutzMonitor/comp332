package week04;

/**
 * Implementation of the Selection Sorting Algorithm mentioned in class
 * @author Christian Gonzalez
 *
 */
public class selectionShort {


	/**
	 * Orders an unsorted array of ints by swapping the location of the smallest element with the 
	 * element that is currently being reordered.
	 * @param sort - this int array
	 * @return - a sorted array of ints
	 */
	public static int[] selectionSort(int[] sort) {

		for(int i = 0; i < sort.length; i++) {
			int min = sort[i];
			int minIndex = i;
			for(int j = i + 1; j < sort.length; j++) {
				if(min > sort[j]) {
					min = sort[j];
					minIndex = j;
				}
			}

			int temp = sort[i];
			sort[i] = min;
			sort[minIndex] = temp;

		}
		return sort;
	}

	/**
	 * Print the contents of an array of ints
	 * @param arr - the array whose items we want to print
	 */
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void main(String[] args) {
		int[] unsorted = { 354, 100, 2, 0, 60 };
		int[] sorted = selectionSort(unsorted);
		printArray(sorted);

	}

}
