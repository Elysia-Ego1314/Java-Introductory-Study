package Work.Test1;

public class Lecturer extends Teacher{
	public Lecturer() {
	}

	public Lecturer(String id, String name, String work) {
		super(id, name, work);
	}
	@Override
	public void workD() {
		System.out.println("讲师主要负责给学生讲课、录课");
	}
}
