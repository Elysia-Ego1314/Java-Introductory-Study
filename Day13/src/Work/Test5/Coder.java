package Work.Test5;

public class Coder extends Employee {
	public Coder() {
	}

	public Coder(String name, String id, int salary) {
		super(name, id, salary);
	}

	@Override
	public void work() {
		System.out.println("程序员的工作是写代码和骂经理");
	}
}
