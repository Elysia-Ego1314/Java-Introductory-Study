package course;

import java.util.Random;
import java.util.Scanner;

/*
双色球彩票系统：
投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1-33中选择；蓝色球号码从1-16中选择。
六等奖：0+1;1+1;2+1:5元
五等奖：3+1;4+0:10元
四等奖：4+1;5+0:200元
三等奖：5+1:3000元
二等奖：6+0:500万元
一等奖：6+1:1000万元
 */
public class TwoColorBall {
	public static void main(String[] args) {
		int[] arr = createNumber();
		/*for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}*/
		int[] userArr = userInputNumber();
		/*for (int i = 0; i < userArr.length; i++) {
			System.out.print(userArr[i] + " ");
		}*/
		int redCount = 0;
		int blueCount = 0;
		for (int i = 0; i < userArr.length - 1; i++) {
			if (contains(arr, userArr[i])) {
				redCount++;
			}
		}
		if (arr[arr.length - 1] == userArr[userArr.length - 1]) {
			blueCount++;
		}
		//System.out.println(redCount + "+" + blueCount);
		if (redCount == 6 && blueCount == 1) {
			System.out.println("一等奖");
		} else if (redCount == 6 && blueCount == 0) {
			System.out.println("二等奖");
		} else if (redCount == 5 && blueCount == 1) {
			System.out.println("三等奖");
		} else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
			System.out.println("四等奖");
		} else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
			System.out.println("五等奖");
		} else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
			System.out.println("六等奖");
		} else {
			System.out.println("谢谢参与");
		}
	}

	public static int[] userInputNumber() {
		int[] arr = new int[7];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; ) {
			System.out.println("请输入第" + (i + 1) + "个红色球号码:");
			int redNumber = sc.nextInt();
			if (redNumber >= 1 && redNumber <= 33) {
				if (!contains(arr, redNumber)) {
					arr[i] = redNumber;
					i++;
				} else {
					System.out.println("该号码已存在");
				}
			} else {
				System.out.println("红球号码超出范围");
			}
		}
		while (true) {
			System.out.println("请输入蓝色球号码:");
			int blueNumber = sc.nextInt();
			if (blueNumber >= 1 && blueNumber <= 16) {
				arr[6] = blueNumber;
				break;
			} else {
				System.out.println("蓝球号码超出范围");
			}
		}
		return arr;
	}

	public static int[] createNumber() {
		int[] arr = new int[7];
		Random r = new Random();
		for (int i = 0; i < 6; ) {
			int redNumber = r.nextInt(33) + 1;
			if (!contains(arr, redNumber)) {
				arr[i] = redNumber;
				i++;
			}
		}
		arr[6] = r.nextInt(16) + 1;
		return arr;
	}

	public static boolean contains(int[] arr, int number) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				return true;
			}
		}
		return false;
	}
}
