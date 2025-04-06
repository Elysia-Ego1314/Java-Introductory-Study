package course;

import java.util.Scanner;

/*
字符串反转
定义一个方法，实现字符串反转。
键盘录入一个字符串，调用该方法后，在控制台输出结果
例如：键盘录入abc，输出结果cba
 */
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(reverseStr(str));
	}
	public static String reverseStr(String str) {
		String result = "";
		for (int i = str.length()-1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}
}
