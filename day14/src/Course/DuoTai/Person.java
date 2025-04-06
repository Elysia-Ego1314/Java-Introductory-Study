package Course.DuoTai;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
	}

	public void keepPet(Animal a,String something) {
		if (a instanceof Dog) {
			Dog d = (Dog)a;
			System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + d.getColor() + "颜色的" + d.getAge() + "岁的狗");
			d.eat(something);
		}else if (a instanceof Cat) {
			Cat c = (Cat)a;
			System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + c.getColor() + "颜色的" + c.getAge() + "岁的猫");
			c.eat(something);
		}
	}
}
