package Work.Test1;

public class Employee {
	private String id;
	private String name;
	private String work;

	public void workD() {
		System.out.println("员工的具体工作内容");
	}
	public Employee() {
	}

	public Employee(String id, String name, String work) {
		this.id = id;
		this.name = name;
		this.work = work;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
}
