package course;

public class StudentTest {
	public static void main(String[] args) {
		//调用空参构造
		Student s1 = new Student();
		//调用带参构造
		Student s2 = new Student("张三", 23);
		System.out.println(s2.getName() + " " + s2.getAge());
	}
}
