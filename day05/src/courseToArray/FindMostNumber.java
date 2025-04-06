package courseToArray;

/*
求最值：已知数组元素为{33, 5, 22, 44, 55}
找到最大值和最小值
 */
public class FindMostNumber {
	public static void main(String[] args) {
		int[] array = new int[]{33, 5, 22, 44, 55};
		int max = array[0];
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
