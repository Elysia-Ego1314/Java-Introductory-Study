package course.demo1;

public class PingPangSporter extends Sporter implements English{
	public PingPangSporter(String name, int age) {
		super(name, age);
	}

	public PingPangSporter() {
	}

	@Override
	public void speakEnglish() {
		System.out.println("乒乓球运动员在说英语");
	}

	@Override
	public void study() {
		System.out.println("乒乓球运动员在学乒乓球");
	}
}
