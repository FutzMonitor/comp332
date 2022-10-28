package week10;

/**
 * This class implements binary search. Additionally this class
 * implements a ternary search.
 * @author Christian Gonzalez
 * @version October 2022
 */
public class BinarySearch {

	/**
	 * Decrease-and-conquer function to return a searched key 
	 * by dividing an array into three parts, similar to binary search
	 * @param input - array to be searched
	 * @param k - locate k in input
	 * @return - searched key, -1 if the key is not in the list
	 */
	public static int ternarySearch(int[] input, int k) {
		int l = 0;
		int r = input.length - 1;
		do {
			int m1 = (l+r)/3;
			int m2 = 2 * (l+r)/3;
			if(input[m1] == k) {
				return m1;
			}
			if(input[m2] == k) {
				return m2;
			}
			else if(k < input[m1]) {
				r = m1 - 1;
			}
			else if(k > input[m2]) {
				l = m2 + 1;
			}
			else {
				l = m1 + 1;
				r = m2 - 1;
			}
		} while(l <= r);
		// Not in the list
		return -1;	
	}

	/**
	 * Decrease-and-conquer function to return a searched key 
	 * by dividing an array into two parts
	 * @param input - array to be searched
	 * @param k - locate k in input
	 * @return - searched key, -1 if the key is not in the list
	 */
	public static int binarySearch(int[] input, int k) {
		int l = 0;
		int r = input.length - 1;
		do {
			int m = (l+r)/2;
			if(input[m] == k) {
				return m;
			}
			else if(k < input[m]) {
				r = m - 1;
			}
			else {
				l = m + 1;
			}
		} while(l <= r);
		return -1;	
	}


	public static void main(String[] args) {
		int[] a = {10, 20, 30 , 40 ,50, 60, 70, 80, 90};
		System.out.println("Searching location of 60 using BinarySearch: " + binarySearch(a, 60));
		System.out.println("Searching location of 50 using TrenarySearch: " + ternarySearch(a, 50));
	}
}
