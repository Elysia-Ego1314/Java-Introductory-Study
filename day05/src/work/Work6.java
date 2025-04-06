package work;

import java.util.Scanner;

public class Work6 {
	public static void main(String[] args) {
		int[] arr1 = new int[]{12,14,23,45,66,68,70,77,90,91};
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr2 = new int[arr1.length + 1];
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (num > arr1[i]) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			arr2[i] = arr1[i];
		}
		arr2[count] = num;
		for (int i = count+1; i < arr2.length; i++) {
			arr2[i] = arr1[i-1];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
