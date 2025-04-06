package Work.Test3;

public class Test {
	public static void main(String[] args) {
		Phone p = new Phone("小米",1999);
		Phone.setSize(6);
		System.out.println(p.getBrand() + "," + p.getPrice() + "," + p.getSize());
	}
}
