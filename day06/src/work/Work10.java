package work;

import java.util.Scanner;

public class Work10 {
	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		Scanner sc = new Scanner(System.in);
		int from = sc.nextInt();
		int to = sc.nextInt();
		arr = copyOfRange(arr, from, to);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] copyOfRange(int[] arr, int from, int to) {
		int[] newArr = new int[to-from];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[from + i];
		}
		return newArr;
	}
}
