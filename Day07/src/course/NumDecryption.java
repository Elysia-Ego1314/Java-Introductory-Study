package course;

import java.util.Scanner;

import static course.NumEncryption.reverse;

/*
数字解密：
需求：
对NumEncryption的加密进行解密，得到加密前的数字
 */
public class NumDecryption {
	public static void main(String[] args) {
		int[] nums = new int[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			nums[i] += 10;
			nums[i] -= 5;
			nums[i] += 10;
		}
		nums = reverse(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
}
