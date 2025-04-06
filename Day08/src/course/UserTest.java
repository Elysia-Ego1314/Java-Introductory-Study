package course;

import java.util.Scanner;

public class UserTest {
	public static void main(String[] args) {
		User u1 = new User();
		u1.setUsername("abc");
		User u2 = u1;
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		u2.setUsername(name);
		System.out.println(u1.getUsername());
	}
}
