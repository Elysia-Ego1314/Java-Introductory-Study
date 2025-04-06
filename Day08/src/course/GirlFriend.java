package course;

public class GirlFriend {
	private int age;
	private String name;

	public void setAge(int age) {
		if (age >= 18) {
			this.age = age;
		} else {
			System.out.println("数据非法");
		}
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
