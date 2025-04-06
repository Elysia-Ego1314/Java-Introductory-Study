package work;

import java.util.Scanner;

public class Work4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		System.out.println(getAbs(num));
	}

	public static double getAbs(double num) {
		if (num < 0) {
			return -num;
		}
		return num;
	}
}
