package Work.Test1;

public class Tutor extends Teacher{
	public Tutor() {
	}

	public Tutor(String id, String name, String work) {
		super(id, name, work);
	}
	@Override
	public void workD() {
		System.out.println("助教主要负责给学生答疑");
	}
}
