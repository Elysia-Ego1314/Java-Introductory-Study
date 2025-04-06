public class Main {
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5};
		System.out.println(arr[2]);//4
		changeArr(arr);
		System.out.println(arr[2]);//400
	}

	public static int[] changeArr(int[] arr) {
		arr[2] = 400;
		return arr;
	}
}