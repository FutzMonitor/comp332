package week4;

/**
 * Implementation of the Q Algorithm for question 5 of homework 3
 * @author Christian Gonzalez
 * @version September 2022
 */
public class Q {

	public static int QAlgorithm(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return QAlgorithm(n-1) + 2 * n - 1;
		}
	
	}
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 11; i++) {
			System.out.println("QAlgorithm || input: " + i + " || output: " + QAlgorithm(i));
		}
	}
}
