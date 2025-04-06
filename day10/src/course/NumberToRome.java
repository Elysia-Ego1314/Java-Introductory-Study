package course;

import java.util.Scanner;

/*
键盘录入一个字符串
要求1：长度小于等于9
要求2：只能是数字
将内容变为罗马数字
注意：罗马数字是没有0的，如果出现0，变为“”（长度为0的字符串）
 */
public class NumberToRome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		while(true) {
			str = sc.next();
			if (checkStr(str)) {
				break;
			} else {
				str = sc.next();
				continue;
			}
		}
		String[] RomeNumber = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		StringBuilder sb = new StringBuilder();
		for (int i = 0;i<str.length();i++) {
			sb.append(RomeNumber[str.charAt(i)-'0']);
		}
		System.out.println(sb.toString());
	}
	public static boolean checkStr(String str) {
		if (str.length()>9) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)<'0'||str.charAt(i)>'9') {
				return false;
			}
		}
		return true;
	}
}
