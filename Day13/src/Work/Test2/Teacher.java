package Work.Test2;

public class Teacher extends Person {
	private String development;

	public Teacher() {
	}

	public Teacher(String name, int age, String development) {
		super(name, age);
		this.development = development;
	}

	public String getDevelopment() {
		return development;
	}

	public void setDevelopment(String development) {
		this.development = development;
	}

	public void publishForm() {
		System.out.println("发布问题");
	}
}
