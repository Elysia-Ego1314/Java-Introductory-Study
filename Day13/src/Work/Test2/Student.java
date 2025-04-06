package Work.Test2;

public class Student extends Person {
	private String course;

	public Student() {
	}

	public Student(String name, int age, String course) {
		super(name, age);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void fillForm() {
		System.out.println("填写听课反馈");
	}
}
