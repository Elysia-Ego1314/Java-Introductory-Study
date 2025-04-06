package courseToArray;

/*
定义数组{1,2,3,4,5,6,7,8,9,10},统计能被3整除的数字个数
 */
public class CountNumber {
	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
