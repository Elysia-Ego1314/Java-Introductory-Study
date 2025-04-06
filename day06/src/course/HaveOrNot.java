package course;

import java.util.Scanner;

/*
定义一个方法，判断数组中的某个数是否存在，将结果返回
 */
public class HaveOrNot {
	public static void main(String[] args) {
		int[] arr = {1, 5, 8, 12 ,9, 56, 89};
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(contains(arr,number));
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
