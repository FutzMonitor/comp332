package week1;

/**
 * Implementation of the Sieve(n) Algorithm 
 * @author Christian Gonzalez
 *
 */
public class sieve {

	/**
	 * Uses Sieve of Eratosthenes's algorithm to create a list
	 * of primes up to a number greater greater than one
	 * @param m - an integer greatert than one
	 * @prints - all primes inside of the list
	 */
	public static void sievePrimes(int m){
		// Create an array with the size of m
		boolean[] isPrime = new boolean[m];

		// Mark all the array space as true
		for (int i = 0; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
		
		// Remove numbers that are divisible by i
		for (int i = 2; i < Math.sqrt(m); i++) {
			if(isPrime[i] == true) {
				for(int j = (i * i); j < m; j = j + i) {
					isPrime[j] = false;
				}
			}
		}

		System.out.println("List of prime numbers up to " + m + " are: ");
		for (int i = 2; i< isPrime.length; i++) {
			if(isPrime[i] == true) {
				System.out.print(i + ", ");
			}
		}
	}

	public static void main(String[] args) {
		sievePrimes(100);
	}
}
