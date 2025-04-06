package courseToCycleHigh;

import java.util.Scanner;

/*
求一个数平方根的整数部分
 */
public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 1; i < number; i++) {
			if (i * i == number) {
				System.out.println(i + "就是" + number + "的平方根");
				break;
			}
			if (i * i > number) {
				System.out.println((i-1) + "就是" + number + "平方根的整数部分");
				break;
			}
		}
	}
}
