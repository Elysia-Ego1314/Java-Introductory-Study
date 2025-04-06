package work;

import java.util.Scanner;

public class Work3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		printMax(num1, num2, num3);
	}
	public static void printMax(int num1, int num2, int num3) {
		int max = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		int min = num1 < num2 ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
		int mid = num1 + num2 + num3 - min - max;
		System.out.print(max + " " + mid + " " + min);
	}
}
