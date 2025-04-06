package courseToCycleHigh;

import java.util.Random;
import java.util.Scanner;

/*
随机生成1~100之间的随机数，使用程序猜出是多少
 */
public class GuessNumber {
	public static void main(String[] args) {
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		while (true) {
			int guess = sc.nextInt();
			if (guess == number) {
				System.out.println("猜对了");
				break;
			} else if (guess > number) {
				System.out.println("猜大了");
			} else if (guess < number) {
				System.out.println("猜小了");
			}
		}
	}
}
