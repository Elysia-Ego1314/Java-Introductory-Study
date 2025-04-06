package courseToArray;

import java.util.Random;

/*
打乱数组中的数据
定义一个数组，存入1~5。打乱数组中所有数据的顺序
 */
public class DisruptNumber {
	public static void main(String[] args) {
		Random r = new Random();
		int[] array = new int[]{1, 2, 3, 4, 5};
		for (int i = 0; i < array.length; i++) {
			int index = r.nextInt(array.length);
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
