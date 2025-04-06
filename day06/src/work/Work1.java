package work;

import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println(compare(num1, num2));
	}

	public static double compare(double num1, double num2) {
		if (num1 > num2) {
			return num2;
		}
		return num1;
	}

}
