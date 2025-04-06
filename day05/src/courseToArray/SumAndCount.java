package courseToArray;

import java.util.Random;

/*
生成10个1~100之间的随机数，存入数组
1、求出所有数据的和
2、求所有数据的平均值
3、统计有多少个数据比平均值小
 */
public class SumAndCount {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random r = new Random();
		//将随机数存入数组
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
		}
		//求和
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		//求平均数
		int avg = sum / arr.length;
		System.out.println(avg);
		//统计小于平均数的个数
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < avg) {
				count++;
			}
		}
		System.out.println(count);
	}
}
