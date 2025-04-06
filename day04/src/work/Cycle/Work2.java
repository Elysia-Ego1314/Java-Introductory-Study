package work.Cycle;

import java.util.Scanner;

/*
需求：键盘录入两个数字，表示一个范围。
          统计这个范围中。
	    既能被3整除，又能被5整除数字有多少个？
 */
public class Work2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int sum = 0;
		for (int i = number1; i <= number2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
