package Course.Static.StudentUtil;

import java.util.ArrayList;

public class TestDemo {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("张三",23,"男"));
		list.add(new Student("李四",24,"男"));
		list.add(new Student("王五",25,"男"));
		System.out.println(StudentUtil.getMaxAge(list));
	}
}
