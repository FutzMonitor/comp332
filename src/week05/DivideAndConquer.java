package week05;
/**
 * Class that implements various divide and conquer algorithms mentioned in class
 * @author Christian Gonzalez
 * @version October 2022
 */
public class DivideAndConquer {

	/**
	 * Computes the sum of the values in the array {input} using divide-and-conquer
	 * @param input - the array whose elements are to be summed
	 * @param left - the leftmost part of the array
	 * @param right - the rightmost part of the array
	 * @return - the sum of all the elements in the inputted array
	 */
	public static int DCSum(int[] input, int left, int right) {
		if(left == right) {
			return input[left];
		}
		else {
			int midpoint = (int) Math.floor((left+right)/2);
			int temp1 = DCSum(input, left, midpoint);
			int temp2 = DCSum(input, midpoint + 1, right);
			return temp1 + temp2;
		}
	}
	
	public int[] mergeSort(int[] input) {

		return input;
		
	}
	
	public static void main(String[] args) {
		int[] fifteen = {2, 2, 2, 2, 2, 2, 2, 1};
		System.out.println(DCSum(fifteen, 0 , fifteen.length - 1));
	}
}
