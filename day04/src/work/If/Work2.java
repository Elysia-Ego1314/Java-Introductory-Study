package work.If;
/*
让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
 */
import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		System.out.println(number1<number2?number1<number3?number1:number3:number2<number3?number2:number3);
	}
}
