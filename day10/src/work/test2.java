package work;

import java.util.Random;
import java.util.Scanner;

/*
键盘输入任意字符串，打乱里面的内容
 */
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] c = str.toCharArray();
		Random r = new Random();
		for (int i = 0;i<c.length;i++) {
			int num = r.nextInt(c.length);
			char temp = c[i];
			c[i] = c[num];
			c[num] = temp;
		}
		System.out.println(new String(c));
	}
}
