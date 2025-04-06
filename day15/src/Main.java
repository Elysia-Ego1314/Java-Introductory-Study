import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.print(":");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Thread.sleep(300);
		System.out.print("think");
		for(int i = 0;i<5;i++) {
			Thread.sleep(500);
			System.out.print(".");
		}
		System.out.println();
		System.out.println("服务器异常，请稍后重试");
	}
}