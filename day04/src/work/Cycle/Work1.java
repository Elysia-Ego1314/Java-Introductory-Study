package work.Cycle;

import java.util.Scanner;

/*
键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。
 */
public class Work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int sum = 0;
		for (int i = number1;i<=number2;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
