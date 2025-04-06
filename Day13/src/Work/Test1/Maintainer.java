package Work.Test1;

public class Maintainer extends AdminStaff {
	public Maintainer() {
	}

	public Maintainer(String id, String name, String work) {
		super(id, name, work);
	}
	@Override
	public void workD() {
		System.out.println("维护专员主要负责设备的维护工作");
	}
}
