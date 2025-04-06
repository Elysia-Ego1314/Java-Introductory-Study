package work;

import java.util.Random;

public class Work11 {
	public static void main(String[] args) {
		int[] arr = new int[]{2, 588, 888, 1000, 10000};
		drawPrize(arr);
	}

	public static void drawPrize(int[] arr) {
		int[] newArr = new int[arr.length];
		Random r = new Random();
		int count = 0;
		while (count != arr.length) {
			int prize = r.nextInt(arr.length);
			if (newArr[prize] == 0) {
				count++;
				newArr[prize] = 1;
				System.out.println(arr[prize] + "元的奖金被抽出");
			}
		}
	}
}
