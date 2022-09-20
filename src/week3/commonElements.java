package week3;

import java.util.ArrayList;

/**
 * Implementation of the common elements question
 * @author Christian Gonzalez
 *
 */
public class commonElements {


	public static ArrayList<Integer> commonElement(int[] a, int[] b) {
		ArrayList<Integer> comElements = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while(i < a.length && j < b.length) {
			if(a[i] == b[j]) {
				comElements.add(a[i]);
				i++;
				j++;
			}
			else if(a[i] < b[j]) {
				i++;
			}
			else {
				j++;
			}
		}
		return comElements;
	}



	public static void main(String[] args) {
		int[] firstArr = {2, 5, 5, 5, 5};
		int[] secondArr = {2, 2, 3, 5, 5, 7};
		int[] biggerArr = {1, 1, 1, 1, 1, 1, 1, 1, 2};

		System.out.println("Elements in common: " + commonElement(firstArr, secondArr));
	}

}
