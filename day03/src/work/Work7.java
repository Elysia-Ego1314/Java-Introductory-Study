package work;
/*
键盘录入一个三位数，求这个三位数每一位的数字和。
 */
import java.util.Scanner;

public class Work7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		while (number!=0) {
			sum+=number%10;
			number /= 10;
		}
		System.out.println(sum);
	}
}
