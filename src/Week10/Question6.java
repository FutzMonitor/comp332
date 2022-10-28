package Week10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class seeks to resolve the problem proposed by question 6
 * in homework 8 of COMP332
 * @author Christian Gonzalez
 * @version October 2022
 */
public class Question6 {

	/**
	 * Finds the missing element from a sorted array
	 * @param input - a sorted array
	 * @return - the missing element
	 */
	public static int FindMissingNum(int[] input) {
		int l = 0, r = input.length - 1;

		if(input[0] != 1) {
			return l + 1;
		}
		if(input[input.length - 1] != input.length + 1) {
			return input.length + 1;
		}

		while(l <= r) {
			int m = (l + r)/2;
			
			if(input[m] != m + 1 && input[m - 1] == m) {
				return m + 1;
			}
			if(input[m] == m + 1) {
				l = m + 1;
			}
			else {
				r = m - 1;
			}
		}
		//No missing number
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("What is the value of n (n >= 2)?");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int userArray[] = new int [size - 1];

		System.out.println("Please enter the numbers in increasing order starting at 1:  ");
		for(int i = 0; i < userArray.length; i++) {
			userArray[i] = s.nextInt();
		}
		// The Arrays class gives access to additional Array methods
		System.out.println("Contents of the array are: "+ Arrays.toString(userArray));
		System.out.println("The missing number is: " + FindMissingNum(userArray));
	}
}
