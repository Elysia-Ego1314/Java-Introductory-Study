package Work.Test1;

public class Buyer extends AdminStaff{
	public Buyer() {
	}

	public Buyer(String id, String name, String work) {
		super(id, name, work);
	}
	@Override
	public void workD() {
		System.out.println("采购专员主要负责教学设备的采购工作");
	}
}
