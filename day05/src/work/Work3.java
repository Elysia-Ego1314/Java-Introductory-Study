package work;

import java.util.Random;

public class Work3 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[6];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
