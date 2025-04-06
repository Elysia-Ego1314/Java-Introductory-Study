package course;

import java.util.Random;

/*
开发验证码
需求：
定义方法实现随机产生一个5位验证码
验证码格式：
	长度为5
	前四位是大写字母或小写字母
	最后一位是数字
 */
public class VerificationCode {
	public static void main(String[] args) {
		char[] c = new char[52];
		for (int i = 0; i < c.length; i++) {
			if (i <= 25) {
				c[i] = (char) ('a' + i);
			} else {
				c[i] = (char) ('A' + i - 26);
			}
		}
		Random r = new Random();
		String s = "";
		for (int i = 0; i < 4; i++) {
			s = s + c[r.nextInt(c.length)];
		}
		s = s + r.nextInt(10);
		System.out.println(s);
	}
}
