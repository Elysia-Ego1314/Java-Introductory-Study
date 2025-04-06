package Work.Test3;

public class Phone {
	private String brand;
	private double price;
	private static int size;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getSize() {
		return size;
	}

	public static void setSize(int size) {
		Phone.size = size;
	}

	public Phone(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public Phone() {
	}

	public void call() {
		System.out.println("手机可以打电话");
	}

	public void sendMessage() {
		System.out.println("手机可以发短信");
	}

	public void PlayGame() {
		System.out.println("手机可以玩游戏");
	}
}
