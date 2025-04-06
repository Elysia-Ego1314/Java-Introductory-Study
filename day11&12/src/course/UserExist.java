package course;
/*
main方法定义一个集合，存入三个对象
用户属性为：id,username,password
定义一个方法，根据id查找用户信息，如果找到返回true，找不到返回false
 */
import java.util.ArrayList;

public class UserExist {
	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();
		User u1 = new User(1,"zhangsan","123456");
		User u2 = new User(2,"lisi","123456");
		User u3 = new User(3,"wangwu","123456");
		list.add(u1);
		list.add(u2);
		list.add(u3);
		System.out.println(exist(list,1));
	}
	public static boolean exist(ArrayList<User> list,int id) {
		for (int i = 0;i<list.size();i++) {
			if (list.get(i).getId() == id) {
				return true;
			}
		}
		return false;
	}
}
