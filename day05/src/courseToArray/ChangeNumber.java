package courseToArray;

/*
定义数组{1,2,3,4,5,6,7,8,9,10}，如果是偶数，则除以二分之一，奇数乘二
 */
public class ChangeNumber {
	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] /= 2;
			} else {
				arr[i] *= 2;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
