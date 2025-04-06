package course.twoObjectArrays.test5;

public class StudentTest {
	public static void main(String[] args) {
		Student[] arr = new Student[3];
		Student stu1 = new Student("heima001", "awei", 18);
		Student stu2 = new Student("heima002", "nigulasi", 18);
		Student stu3 = new Student("heima003", "尼古拉斯阿玮", 18);
		arr[0] = stu1;
		arr[1] = stu2;
		arr[2] = stu3;
		Student stu4 = new Student("zhuhuo002", "Elysia", 18);
		if (contains(arr, stu4)) {//判断id是否重复
			//不重复
			int count = getCount(arr);//获取数组中已经存的数量
			if (count == arr.length) {//判断是否存满
				//如果存满则创建一个新数组，并将旧的重新复制进去
				Student[] newArr = createNewArr(arr);
				newArr[count] = stu4;
				//printArr(newArr);
				int index = getIndex(newArr, "heima001");
				if (index >= 0) {
					newArr[index] = null;
					printArr(newArr);
					newArr = requestFive(newArr,"heima002");
					System.out.println(arr[1].getAge());
				} else {
					System.out.println("id不存在，删除失败");
				}
			} else {
				//如果没装满则直接添加
				arr[count] = stu4;
				//printArr(arr);
				int index = getIndex(arr, "heima001");
				if (index >= 0) {
					arr[index] = null;
					printArr(arr);
				} else {
					System.out.println("id不存在，删除失败");
				}
			}
		} else {
			//重复
			System.out.println("id重复");
		}
	}

	public static Student[] requestFive(Student[] arr, String str) {
		int index = getIndex(arr, str);
		if (index >= 0) {
			Student stu = arr[index];
			stu.setAge(stu.getAge() + 1);
		}else {
			System.out.println("id不存在");
		}
		return arr;
	}

	public static int getIndex(Student[] arr, String str) {
		for (int i = 0; i < arr.length; i++) {
			Student stu = arr[i];
			if (stu != null) {
				if (stu.getId().equals(str)) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void printArr(Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			Student stu = arr[i];
			if (stu != null) {
				System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge());
			}
		}
	}

	public static Student[] createNewArr(Student[] arr) {
		Student[] newArr = new Student[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

	public static int getCount(Student[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr != null) {
				count++;
			}
		}
		return count;
	}

	public static boolean contains(Student[] arr, Student stu) {
		for (int i = 0; i < arr.length; i++) {
			Student student = arr[i];
			if (student != null) {
				if (student.getId().equals(stu.getId())) {
					return false;
				}
			}
		}
		return true;
	}
}
