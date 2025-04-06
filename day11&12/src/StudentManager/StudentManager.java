package StudentManager;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<User> userInfo = new ArrayList<>();
		login:
		while (true) {
			System.out.println("欢迎来到学生管理系统");
			System.out.println("请选择操作1登录 2注册 3忘记密码");
			String choose = sc.next();
			switch (choose) {
				case "1": {//返回0 用户不存在；返回1 密码错误；返回2 登录成功
					int flag = Login(userInfo);
					if (flag == 0) {
						System.out.println("用户名未注册，请先注册");
						break;
					} else if (flag == 1) {
						System.out.println("密码错误，机会已用完，系统退出");
						return;
					} else {
						System.out.println("登录成功");
						break login;
					}
				}
				case "2": {
					userInfo = Signup(userInfo);
					break;
				}
				case "3": {
					userInfo = forgetPassword(userInfo);
					break;
				}
				default: {
					System.out.println("没有这个选项");
					break;
				}
			}
		}
		ArrayList<Student> list = new ArrayList<>();
		loop:
		while (true) {
			System.out.println("\"-------------欢迎来到黑马学生管理系统----------------\"");
			System.out.println("\"1：添加学生\"");
			System.out.println("\"2：删除学生\"");
			System.out.println("\"3：修改学生\"");
			System.out.println("\"4：查询学生\"");
			System.out.println("\"5：退出\"");
			System.out.println("\"请输入您的选择:\"");
			String choose = sc.next();
			switch (choose) {
				case "1": {
					list = addStudent(list);
					System.out.println("添加成功");
					break;
				}
				case "2": {
					delStudent(list);
					break;
				}
				case "3": {
					updateStudent(list);
					break;
				}
				case "4": {
					selectStudent(list);
					break;
				}
				case "5": {
					System.out.println("退出");
					break loop;
				}
				default:
					System.out.println("没有这个选项");
			}
		}
	}

	//用户登录
	public static int Login(ArrayList<User> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = sc.next();
		System.out.println("请输入密码");
		String password = sc.next();
		String verify = getVerification();
		System.out.println("验证码为" + verify + "\n请输入验证码");
		String verification = sc.next();
		if (!containUser(list, username)) {
			return 0;
		}
		while (true) {
			if (verification.equalsIgnoreCase(verify)) {
				break;
			} else {
				System.out.println("验证码错误，请重新输入");
				verification = sc.next();
			}
		}
		String getPassword = list.get(getIndexUser(list, username)).getPassword();
		int count = 0;
		while (true) {
			if (getPassword.equals(password)) {
				return 2;
			} else {
				count++;
				if (count == 3) {
					break;
				}
				System.out.println("密码错误，您还有" + (3 - count) + "次机会\n请重新输入密码");
				password = sc.next();
			}
		}
		return 1;
	}

	//生成验证码
	public static String getVerification() {
		char[] letters = new char[52];
		for (int i = 0; i < 26; i++) {
			letters[i] = (char) ('a' + i);
			letters[26 + i] = (char) ('A' + i);
		}
		char[] nums = new char[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (char) ('0' + i);
		}
		String str = "";
		Random r = new Random();
		for (int i = 0; i < 4; i++) {
			str = str + letters[r.nextInt(52)];
		}
		str = str + nums[r.nextInt(10)];
		char[] s = str.toCharArray();
		for (int i = 0; i < 5; i++) {
			int index = r.nextInt(5);
			char temp = s[i];
			s[i] = s[index];
			s[index] = temp;
		}
		return new String(s);
	}

	//用户注册
	public static ArrayList<User> Signup(ArrayList<User> userInfo) {
		Scanner sc = new Scanner(System.in);
		String username;
		String password1;
		String password2;
		String idCard;
		String phoneNumber;
		while (true) {
			System.out.println("请输入用户名");
			username = sc.next();
			if (containUser(userInfo, username)) {
				System.out.println("用户名已存在，请重新录入");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("请输入密码");
			password1 = sc.next();
			System.out.println("请再次输入密码");
			password2 = sc.next();
			if (password2.equals(password1)) {
				break;
			} else {
				System.out.println("两次输入密码不一致，请重新输入");
			}
		}
		while (true) {
			System.out.println("请输入身份证号");
			idCard = sc.next();
			if (!verifyIdCard(idCard)) {
				System.out.println("身份证不正确，请重新输入");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("请输入手机号");
			phoneNumber = sc.next();
			if (verifyPhoneNumber(phoneNumber)) {
				break;
			} else {
				System.out.println("手机号码格式不正确，请重新输入");
			}
		}
		User user = new User(username, password1, idCard, phoneNumber);
		userInfo.add(user);
		return userInfo;
	}

	//忘记密码
	public static ArrayList<User> forgetPassword(ArrayList<User> list) {
		System.out.println("请输入用户名");
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		if (!containUser(list, username)) {
			System.out.println("未注册");
			return list;
		}
		System.out.println("请输入身份证号");
		String idCard = sc.next();
		System.out.println("请输入手机号");
		String phoneNumber = sc.next();
		if (idCard.equalsIgnoreCase(list.get(getIndexUser(list, username)).getIdCard()) && phoneNumber.equals(list.get(getIndexUser(list, username)).getPhoneNumber())) {
			System.out.println("请输入新密码");
			String password = sc.next();
			list.get(getIndexUser(list, username)).setPassword(password);
			System.out.println("修改成功");
		} else {
			System.out.println("修改失败");
		}
		return list;
	}

	//查找用户是否存在
	public static boolean containUser(ArrayList<User> list, String username) {
		return getIndexUser(list, username) >= 0;
	}

	//查找用户索引
	public static int getIndexUser(ArrayList<User> list, String username) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getUsername().equals(username)) {
				return i;
			}
		}
		return -1;
	}

	//验证身份证格式是否正确
	public static boolean verifyIdCard(String str) {
		if (str.length() != 18) {
			return false;
		}
		for (int i = 0; i < 17; i++) {
			if (i == 0) {
				if (str.charAt(0) == '0') {
					return false;
				}
			}
			if ('0' > str.charAt(i) || str.charAt(i) > '9') {
				return false;
			}
		}
		if ((str.charAt(17) >= '0' && str.charAt(17) <= '9') || str.charAt(17) == 'x' || str.charAt(17) == 'X') {
			return true;
		}
		return false;
	}

	//验证手机号码格式是否正确
	public static boolean verifyPhoneNumber(String str) {
		if (str.length() != 11) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				if (str.charAt(0) == '0') {
					return false;
				}
			}
			if ('0' > str.charAt(i) || str.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

	//添加学生
	public static ArrayList<Student> addStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		String id;
		while (true) {
			System.out.println("请输入学生id");
			id = sc.next();
			if (contain(list, id)) {
				System.out.println("id已存在请重新录入");
			} else {
				break;
			}
		}
		System.out.println("请输入学生姓名");
		String name = sc.next();
		System.out.println("请输入学生年龄");
		int age = sc.nextInt();
		System.out.println("请输入学生家庭住址");
		String homeAddress = sc.next();
		Student student = new Student(id, name, age, homeAddress);
		list.add(student);
		return list;
	}

	//删除学生
	public static ArrayList<Student> delStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要删除学生的id");
		String id = sc.next();
		int index = getIndex(list, id);
		if (index == -1) {
			System.out.println("id不存在");
		} else {
			list.remove(getIndex(list, id));
			System.out.println("删除成功");
		}
		return list;
	}

	//更新学生信息
	public static void updateStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要修改学生的id");
		String id = sc.next();
		if (contain(list, id)) {
			System.out.println("请输入学生的姓名");
			String name = sc.next();
			System.out.println("请输入学生的年龄");
			int age = sc.nextInt();
			System.out.println("请输入学生的家庭住址");
			String homeAddress = sc.next();
			int index = getIndex(list, id);
			Student student = new Student(id, name, age, homeAddress);
			list.set(index, student);
			System.out.println("信息更新成功");
		} else {
			System.out.println("id不存在");
		}
	}

	//打印学生信息
	public static void selectStudent(ArrayList<Student> list) {
		if (list.size() == 0) {
			System.out.println("当前无学生信息，请添加后在查询");
			return;
		}
		System.out.println("id\t" + "姓名\t" + "年龄\t" + "家庭住址");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId() + "\t" + list.get(i).getName() + "\t" + list.get(i).getAge() + "\t" + list.get(i).getHomeAddress());
		}
	}

	//判断学生id是否存在
	public static boolean contain(ArrayList<Student> list, String id) {
//		for (int i = 0;i<list.size();i++) {
//			if (list.get(i).getId().equals(id)) {
//				return true;
//			}
//		}
//		return false;
		return getIndex(list, id) >= 0;
	}

	//查找学生索引
	public static int getIndex(ArrayList<Student> list, String id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}
}
