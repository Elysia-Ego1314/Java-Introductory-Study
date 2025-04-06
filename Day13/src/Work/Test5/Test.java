package Work.Test5;

public class Test {
	public static void main(String[] args) {
		Coder coder = new Coder("张三", "123", 19999);
		Manager sb = new Manager("李彦宏", "250", -478, -478);
		coder.work();
		sb.work();
	}
}
