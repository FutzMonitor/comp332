package week10;

import java.util.Arrays;

/**
 * Implementation of the QuickSelect algorithm using pseudocode provided 
 * in class
 * @author Christian Gonzalez
 * @version October 2022
 */
public class QuickSelect {

	/**
	 * Partitions a subarray by using its first element as a pivot using
	 * Hoares's partitioning algorithm
	 * @param input - an array
	 * @param l - the left bounds  for the subarray of input
	 * @param r - the right bounds for the subarray of input
	 * @return - the split position of the pivot for the partition
	 *           of the subarray
	 */
	public static int HoaresPartition(int[] A, int l, int r) {
		int pivot = A[l];
		int i = l - 1;
		int j = r + 1;

		while (true) {
			do {
				i++;
			} while (A[i] < pivot);

			do {
				j--;
			} while (A[j] > pivot);

			if (i >= j) {
			return j;
			}
			swap(A, i, j);
			swap(A, l, j);
		}
	}

	/**
	 * By using recursive QuickSelect, the algoirhtm locates the kth 
	 * order statistic through a decrease-and-conquer approach of 
	 * decreasing the problem into smaller pieces
	 * @param A - an array
	 * @param k - kth element to locate
	 * @param l - left bounds to consider for the A's subarray
	 * @param r - right bounds to consider for the A's subarray
	 * @return - the kth smallest element
	 */
	public static int quickSelect(int[] A, int k, int l, int r) {
		int s = HoaresPartition(A, l, r);
		System.out.println("This is the value of s: " + s + " || This is the value of l: " + l + " || This is the value of r: " + r);;
		printArr(A, l, r);
		System.out.println();
		if(s == k - 1) {
			return A[s];
		}
		else if(s > k - 1) {
			return quickSelect(A, k, l, s - 1);
		}
		else {
			return quickSelect(A, k, s + 1, r);
		}

	}

	/**
	 * Swaps the location of two elements in an array
	 * @param A - the array
	 * @param indOne - first index of element to be swapped
	 * @param indSec - second index of element to be swapped
	 */
	public static void swap(int[] A, int indOne, int indSec) {
		int temp = A[indSec];
		A[indSec] = A[indOne];
		A[indOne] = temp;
	}

	public static void printArr(int[] A, int l, int r) {
		for(int i = l; i < r + 1; i++) {
			System.out.print(A[i] + ", ");
		}
	}

	public static void main(String[] args) {
		// Inserting comment via GitHub site
		// Ignore this class for now, it isn't working as intended.
		int[] ex = {9, 7, 12, 8, 10, 15};

		// Initial Call quickSelect(A, k, 0, A.length - 1)
		System.out.println("The 5th smallest k is: " + quickSelect(ex, 5, 0, ex.length - 1));
		System.out.println("The 3rd smallest k is: " + quickSelect(hw6, 4, 0, hw6.length - 1));

	}
}
