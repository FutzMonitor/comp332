package week9;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/**
 * This class implements some of the algorithms mentioned in class using
 * the pseudocode provided in the notes.
 * @author Christian Gonzalez
 * @version October 2022
 */
public class DecreaseAndConquer {

	
	public static int DbyCFPower(int base, int power) {
		if(power == 1) {
			return base;
		}
		else if (power % 2 == 0) {
			return (int) Math.pow(DbyCFPower(base, power/2), 2);
		}
		else {
			return base * (int) Math.pow(DbyCFPower(base, power/2), 2);
		}
	}
	
	public static void main(String[] args) {
		Scanner numInputs = new Scanner(System.in);
		
		System.out.print("Please enter the base: ");
		int a = numInputs.nextInt();
		System.out.print("Please enter the power: ");
		int b = numInputs.nextInt();
		int c = DbyCFPower(a, b);
		System.out.println("Result: " + c);
	}
}
