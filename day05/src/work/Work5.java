package work;

public class Work5 {
	public static void main(String[] args) {
		int[] arr = new int[]{72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum/arr.length);
	}
}
