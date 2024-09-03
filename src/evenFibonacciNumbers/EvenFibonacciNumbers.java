package evenFibonacciNumbers;
import java.util.Scanner;

/*
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
 * find the sum of the even-valued terms.
 * 
 */

public class EvenFibonacciNumbers {
	
	//takes too long for numbers over 40
	public static int fibonacci(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static int evenSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i ++) {
			if (fibonacci(i) % 2 == 0) {
				sum += fibonacci(i);
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the number of the position whose sum you wish to find: ");
		int n = sc.nextInt();
		
		System.out.println(evenSum(n));
	}

}
