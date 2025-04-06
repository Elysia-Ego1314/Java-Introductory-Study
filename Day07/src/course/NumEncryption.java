package course;

import java.util.Scanner;

/*
数字加密
需求：
某系统的数字密码(大于0)，比如1983，采用加密方式进行传输
规则如下：
	先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。
 */
public class NumEncryption {
	public static void main(String[] args) {
		int[] nums = new int[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			nums[i] += 5;
			nums[i] %= 10;
		}
		nums =  reverse(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
	public static int[] reverse(int[] arr) {
		int[] newArr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			newArr[arr.length - 1 - i] = arr[i];
		}
		return newArr;
	}
}