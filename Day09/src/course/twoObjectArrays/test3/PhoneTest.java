package course.twoObjectArrays.test3;

public class PhoneTest {
	public static void main(String[] args) {
		Phone[] arr = new Phone[3];
		Phone p1 = new Phone("xiaomi",1999,"black");
		Phone p2 = new Phone("OPPO",5999,"blue");
		Phone p3 = new Phone("MEIZU",2599,"argent");
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		int priceSum = 0;
		for (int i = 0; i < arr.length; i++) {
			Phone phone = arr[i];
			priceSum = priceSum + phone.getPrice();
		}
		int avg = priceSum / arr.length;
		System.out.println(avg);
	}
}
