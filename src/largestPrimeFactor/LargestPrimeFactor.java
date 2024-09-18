/*
 * The prime factors of 13195 are 5, 7, 13 and 29
 * What is the largest prime factor of the number 600851475143?
 */

package largestPrimeFactor;

public class LargestPrimeFactor {
	
	public static boolean isPrime(long n) {
		for (long i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static long findPrimeFactor(long n) {
		if (isPrime(n)) {
			return n;
		}
		
		long x = 0;
		for (long i = 2; i < n; i++) {
			if (isPrime(i)) {
				if (n % i == 0) {
					x = i;
				}
			}
		}
		
		return x;
	}

	public static void main(String[] args) {
		long x = 600851475143L;
		System.out.println(findPrimeFactor(x));
	}

}
