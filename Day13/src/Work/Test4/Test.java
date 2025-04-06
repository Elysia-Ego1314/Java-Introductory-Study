package Work.Test4;

public class Test {
	public static void main(String[] args) {
		Student s = new Student("张三", "男", 20, "1", "1", "12345");
		Worker w = new Worker("李四", "男", 30, "1", "1", 8);
		StudentLeader sl = new StudentLeader("李四", "男", 24, "1", "1", "250", "自律会");
		s.work();
		w.work();
		sl.meeting();
	}
}
