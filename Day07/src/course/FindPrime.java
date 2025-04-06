package course;

/*
判断101-200之间有多少个素数，并输出所有素数
 */
public class FindPrime {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 101; i <= 200; i++) {
			boolean flag = findPrime(i);
			if (flag) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("共有" + count + "个");
	}

	public static boolean findPrime(int num) {
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
