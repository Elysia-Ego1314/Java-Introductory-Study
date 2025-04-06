package course;

import java.util.Scanner;

public class DivisionToWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		int result = 0;
		while (dividend >= divisor) {
			dividend = dividend - divisor;
			result++;
		}
		System.out.println(result);
		System.out.println(dividend);
	}
}
