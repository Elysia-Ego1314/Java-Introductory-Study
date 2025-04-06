package work.Cycle;

import java.util.Scanner;

/*
需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，
	假如我有一张足够大的纸，它的厚度是0.1毫米。
	请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 */
public class Work3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double paperThickness = 0.1;
		while (paperThickness <= 8844430) {
			paperThickness *= 2;
			sum++;
		}
		System.out.println(sum);
	}
}
