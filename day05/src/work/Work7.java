package work;

import java.util.Random;

public class Work7 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
		}
		for (int i = 0,j = arr.length-1; i < j;) {
			if (arr[i]%2 == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			} else {
				i++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
