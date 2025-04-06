package Work.Test6;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog(2, "黑色");
		Cat cat = new Cat(2, "白色");
		Person person = new Person("张三", 23);
		person.keepPet(dog,"骨头");
		person.keepPet(cat,"小鱼干");
	}
}
