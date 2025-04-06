package Work.Test1;

public class AdminStaff extends Employee{
	public AdminStaff() {
	}

	public AdminStaff(String id, String name, String work) {
		super(id, name, work);
	}
	@Override
	public void workD() {
		System.out.println("行政部主要负责行政工作");
	}
}
