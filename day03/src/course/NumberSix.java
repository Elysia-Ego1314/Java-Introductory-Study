package course;

import java.util.Scanner;

public class NumberSix {
	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		if (number1 == 6||number2 == 6||(number1+number2) % 6 == 0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
