package work;

import java.util.Scanner;

public class Work7 {
	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3, 5, 6};
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		arr = fill(arr, num);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] fill(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num;
		}
		return arr;
	}
}
