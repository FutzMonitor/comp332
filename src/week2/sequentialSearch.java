package week2;

import java.util.ArrayList;

/**
 * Implements the Sequential Search Algorithm mentioned in class
 * @author Christian Gonzalez
 *
 */
public class sequentialSearch {

	/**
	 * Implements Sequential Search using a for-loop
	 * @param input - the array to be searched through
	 * @return - the index of the searched element
	 */
	public static int forSequentialSearch(int[] input, int target) {
		// Array must have a length greater than 0
		if(input.length == 0) {
			return -1;
		}
		for(int i = 0; i < input.length; i++) {
			if(input[i] == target) {
				return i;
			}
		}
		// Not in the array
		return -1;
	}
	
	/**
	 * Implements Sequential Search using a while-loop
	 * @param input - the array to be searched through
	 * @return - the index of the searched element
	 */
	public static int whileSequentialSearch(int[] input, int target) {
		// Array must have a length greater than 0
		if(input.length == 0) {
			return -1;
		}
		int index = input.length - 1;
		while (index > 0) {
			if(input[index] == target) {
				return index;
			}
			else {
				index--;
			}
		}
		// Not in the array
		return -1;
	}
	
	/**
	 * Implements Sequential Search using recursion
	 * @param input - the array to be searched through
	 * @return - the index of the searched element
	 */
	public static int recursiveSequentialSearch(ArrayList<Integer> input, int target) {
		if(input.size() == 0) {
			return -1;
		}
		else if(input.get(input.size() - 1) == target) {
			return (input.size() - 1);
		}
		else {
			input.remove(input.size() - 1);
			return recursiveSequentialSearch(input, target);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> listSample = new ArrayList<>();
		ArrayList<Integer> emptyList = new ArrayList<>();
		listSample.add(2);
		listSample.add(87);
		listSample.add(20);
		listSample.add(6);
		listSample.add(4);
		
		int[] sample = {2, 87, 20, 6, 4};
		int[] empty = {};
		 
		System.out.println("Looking for the location of value 20, which should be 2: " + forSequentialSearch(sample, 20));
		System.out.println("Looking for the location of value 20, which should be 2: " + whileSequentialSearch(sample, 20));
		System.out.println("Looking for the location of value 20, which should be 2: " + recursiveSequentialSearch(listSample, 20));
		
		System.out.println("Looking for the location of value 420, which should yield -1: " + forSequentialSearch(sample, 420));
		System.out.println("Looking for the location of value 420, which should yield -1: " + whileSequentialSearch(sample, 420));
		System.out.println("Looking for the location of value 420, which should yield -1: " + recursiveSequentialSearch(listSample, 420));
		
		System.out.println("Looking for the location of value 20, but the list is empty so it should yield -1: " + forSequentialSearch(empty, 420));
		System.out.println("Looking for the location of value 20, but the list is empty so it which should yield -1: " + whileSequentialSearch(empty, 420));
		System.out.println("Looking for the location of value 20, but the list is empty so it which should yield -1: " + recursiveSequentialSearch(emptyList, 420));
	}
	
}
