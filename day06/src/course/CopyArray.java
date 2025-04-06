package course;

/*
复制数组
需求：定义一个方法copyOfRange(int[] arr, int from, int to)
功能：将数组arr中从索引from开始。到索引to结束(不包含to)的元素复制到新数组中，
将新数组返回
 */
public class CopyArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5, 6, 7, 9, 12, 45, 78};
		int[] arr2 = copyOfRange(arr,3,7);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

	public static int[] copyOfRange(int[] arr, int from, int to) {
		int[] arr2 = new int[to-from];
		for (int i = from; i < to; i++) {
			arr2[i-from] = arr[i];
		}
		return arr2;
	}
}
