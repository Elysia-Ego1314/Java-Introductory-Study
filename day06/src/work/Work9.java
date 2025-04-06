package work;

import java.util.Scanner;

public class Work9 {
	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3, 4, 56, 7, 8, 9};
		Scanner sc = new Scanner(System.in);
		int newLength = sc.nextInt();
		arr = copyOf(arr, newLength);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] copyOf(int[] arr, int newLength) {
		int[] newArr = new int[newLength];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}
}
