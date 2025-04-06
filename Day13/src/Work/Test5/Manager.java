package Work.Test5;

public class Manager extends Employee {
	private int bonus;

	public Manager() {
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Manager(String name, String id, int salary, int bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("经理的工作是闲的没事找事");
	}
}
