package course;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String num1 = test(str1);
		String num2 = test(str2);
		if (num1.equals(num2)) {
			System.out.println(num1);
		}else {
			System.out.println(num1);
			System.out.println(num2);
		}
	}
	public static String test(String str) {
		int sum;
		if (str.length() == 1) {
			return str;
		}
		String all = "";
		for (int i = 1; i < str.length(); i++) {
			if ((str.charAt(i)-'0')%2 == (str.charAt(i-1)-'0')%2) {
				sum=Math.max(str.charAt(i)-'0',str.charAt(i-1)-'0');
				all = all+sum;
			}
		}
		return all;
	}
}