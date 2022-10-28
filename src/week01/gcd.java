package week01;

/**
 * Finds the greatest common factor using to algorithms illustrated in class.
 * @author Christian Gonzalez
 *
 */
public class gcd {

	/**
	 * Returns the greatest common factor using the Euclidean algorithm using recursion.
	 * @param m - the first nonnegative, nonzero integer.
	 * @param n - the second nonnegative, nonzero integer.
	 * @return - the gcd of the two inputs.
	 */
	public static int euclidGCD(int m, int n) {
		// For debugging purposes
		//System.out.println("m: " + m + "|| n: " + n);
		if(m == 0) {
			return m;
		}
		else if(n == 0) {
			return m;
		}
		else {
			int r = m % n;
			m = n;
			n = r;
			return euclidGCD(m, n);
		}
	}
	
	/**
	 * Returns the greatest common factor using consecutive integer checking .
	 * @param m - the first nonnegative, nonzero integer.
	 * @param n - the second nonnegative, nonzero integer.
	 * @return - the gcd of the two inputs.
	 */
	public static int consecutiveIntGCD(int m, int n) {
		int t;
		if(m == n) {
			return m;
		}
		else if(m > n) {
			t = n;
		}
		else{
			t = m;
		}
		while (t != 0) {
			int mCheck = m % t;
			int nCheck = n % t;
			if(mCheck == 0 && nCheck == 0) {
				return t;
			}
			else {
				t--;
			}
		}
		// Bad inputs.
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("Euclid's Algorithm: " + euclidGCD(24, 60));
		System.out.println("Consecutive Integer Algorithm: " + consecutiveIntGCD(60, 24));
	}
}
