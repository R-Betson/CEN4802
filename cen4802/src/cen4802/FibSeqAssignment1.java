//Rebecca Betson

package cen4802;

public class FibSeqAssignment1 {

	/*
	 * Recursive method to find the nth term in the Fibonacci Sequence
	 * @param n is the position in the Fibonacci Sequence 
	 * @return The nth term of the Fibonacci Sequence, should return the sum of (n-1) and (n-2).
	 */
	public static int fibonacci(int n) {

		if (n <= 1) {

			return n;

		}

		return fibonacci(n - 1) + fibonacci(n - 2);

	}
	
	/*
	 * The main method executes the Fibonacci Sequence method for a given number, in this case 10, and prints the result
	 */

	public static void main(String[] args) {

		int n = 10;

		int result = fibonacci(n);

		System.out.println("The " + n + "th term of the Fibonacci Sequence is " + result + ".");

	}

}