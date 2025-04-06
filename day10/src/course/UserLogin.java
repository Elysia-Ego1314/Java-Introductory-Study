package course;

import java.util.Scanner;

/*
需求；已知正确的用户名和密码，请用程序实现模拟用户登录。
总共给出三次机会，登陆之后，给出相应的提示
 */
public class UserLogin {
	public static void main(String[] args) {
		String rightUsername = "Elysia";
		String rightPassword = "123456";
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			String username = sc.next();
			String password = sc.next();
			if (username.equals(rightUsername) && password.equals(rightPassword)) {
				System.out.println("登录成功");
			} else {
				if (i == 2) {
					System.out.println("账号被锁定");
				} else {
					System.out.println("登录失败,剩余" + (2 - i) + "次机会");
				}
			}
		}
	}
}
