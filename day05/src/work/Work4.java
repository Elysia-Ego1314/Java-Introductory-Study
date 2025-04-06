package work;

public class Work4 {
	public static void main(String[] args) {
		int[] arr = new int[]{2, 1, 3, 5, 4};
		int number = 0;
		for (int i = 0; i < arr.length; i++) {
			number = number * 10 + arr[i];
		}
		System.out.println(number);
	}
}
