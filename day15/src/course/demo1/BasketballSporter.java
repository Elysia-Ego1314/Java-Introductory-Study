package course.demo1;

public class BasketballSporter extends Sporter{
	public BasketballSporter(String name, int age) {
		super(name, age);
	}

	public BasketballSporter() {
	}
	@Override
	public void study(){
		System.out.println("篮球运动员在学打篮球");
	}
}
