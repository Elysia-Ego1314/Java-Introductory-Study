package course;

import java.util.Scanner;

public class NumSplitPlus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = {'个','十','百','千'};
		int num = sc.nextInt();
		int cNum = 0;
		while (num != 0) {
			int weiNum = num%10;
			System.out.println(c[cNum] + "位是" + weiNum);
			num = num / 10;
			cNum++;
		}
	}
}
