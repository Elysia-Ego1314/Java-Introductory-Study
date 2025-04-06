package Work.Test1;

public class Teacher extends Employee{
	public Teacher() {
	}

	public Teacher(String id, String name, String work) {
		super(id, name, work);
	}

	@Override
	public void workD() {
		System.out.println("教研部主要负责教学工作");
	}
}
