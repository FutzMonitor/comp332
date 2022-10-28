package week07;

/**
 * Implementation of a divide-and-conquer element that finds the largest element in an array
 * @author Christian Gonzalez
 * @version October 2022
 */
public class largestElement {


	/**
	 * Returns the largest element in an array using the divide-and-conquer method
	 * @param input - an array of ints
	 * @return the largest element in the array
	 */
	public static int largestElem(int[] input, int l, int r) {
		if(l == r) {
			return input[l];
		}

		int mid = (l+r)/2;
		int maxLeft = largestElem(input, l, mid);
		int maxRight = largestElem(input, mid + 1, r);
		// debugging code :) 
		//System.out.println("Largest element from the left side: " + maxLeft + " || largest element from the right side: " + maxRight);

		if(maxLeft > maxRight) {
			return maxLeft;
		}
		else {
			return maxRight;
		}
	}
	
	public static void main(String[] args) {
		// largest value: 2000
		int[] example = {30, 20, 1, 2, 96, 100, 40, 1000, 20, -4, 3, 590, 100, 2000};
		System.out.println(largestElem(example, 0, example.length - 1));
	}

}
