package work;

import java.util.Scanner;

public class Work8 {
	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Scanner sc = new Scanner(System.in);
		int fromIndex = sc.nextInt();
		int toIndex = sc.nextInt();
		int value = sc.nextInt();
		arr = fill(arr, fromIndex, toIndex, value);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] fill(int[] arr, int fromIndex, int toIndex, int value) {
		for (int i = fromIndex; i < toIndex; i++) {
			arr[i] = value;
		}
		return arr;
	}
}
