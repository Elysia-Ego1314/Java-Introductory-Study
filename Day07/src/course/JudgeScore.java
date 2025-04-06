package course;

import java.util.Scanner;

/*
评委打分
需求：
在歌唱比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。选手最后的得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分
 */
public class JudgeScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[6];
		int count = 0;
		while (true) {
			if (count == 6) {
				break;
			}
			score[count] = sc.nextInt();
			if (score[count] >= 0 && score[count] <= 100) {
				count++;
			}
		}
		int max = getMax(score);
		int min = getMin(score);
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println((sum - max - min) / 4);
	}
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
