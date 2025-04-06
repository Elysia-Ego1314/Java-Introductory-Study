package course;

import java.util.ArrayList;
import java.util.Scanner;

public class TraversalStudent {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student("xi**",1000);
		Student s2 = new Student("zhangsan",20);
		students.add(s1);
		students.add(s2);
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getName() + "," + students.get(i).getAge());
		}
	}
}
