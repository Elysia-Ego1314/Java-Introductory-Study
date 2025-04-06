package course;

import java.util.Scanner;

public class WorkdayWeekend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		switch (week) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("工作日");
				break;
			case 6:
			case 7:
				System.out.println("周末");
				break;
			default:
				System.out.println("输入错误");
				break;
		}
	}
}
